package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	
	//insert회원가입 
	public int insert(DTO dto) {
		int cnt =0;
		
		connect();
	   
		try {
			 String or_id = dto.getUser_id();
			 String or_pw = dto.getUser_pw();
			 String or_name = dto.getUser_name();
			 int or_age = dto.getAge();
			 String start_day = dto.getStart_day();
			 String last_day = dto.getLast_day();
				
			 String sql = "insert into user values(?,?,?,?,?,?,?,?)";//id,pw,name,age,level,lank,coin,ex
			 psmt = conn.prepareStatement(sql);
			 
			 psmt.setString(1, or_id);
			 psmt.setString(2, or_pw);
			 psmt.setString(3, or_name);
			 psmt.setInt(4, or_age);
			 psmt.setInt(5, 1);
			 psmt.setInt(6,1);
			 psmt.setInt(7, 0);
			 psmt.setInt(8, 0);
			 
			 
			 cnt = psmt.executeUpdate();
			 if(cnt>0) {
				 System.out.println("쿼리전송성공.");
			 }else {
				 System.out.println("쿼리전송 실패.");
			 }
			 
			 psmt.close(); //끊어주기.
			 cnt =0;//cnt 다시 초기화.
			 
			 
			 String sql2 ="insert into log valuse(?,?,?)";
			 psmt =conn.prepareStatement(sql2);
			 psmt.setString(1, or_id);
			 psmt.setString(2, start_day); //setDate가 있는데 잠시 대기.
			 psmt.setString(3, last_day);
			 cnt = psmt.executeUpdate();
			 
			 
			
		} catch (SQLException e) {
			System.out.println("쿼리전송 실패.");
		}
		
		
		return cnt;	
	}



	
	
	
	
	
	
	
	
	
	
	
	private void connect() {
		//동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//db연결
			String url = "";
			String id = "";
			String pw = "";
			
			//힌번에 묶기
		Connection conn = DriverManager.getConnection(url,id,pw);
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩실패.");
		} catch (SQLException e) {
			System.out.println("db연결 실");
		}
	}

}
