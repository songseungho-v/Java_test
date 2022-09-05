package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import model.DAO;
import model.DTO;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String user_pw =null;
		String user_pw2=null;
		String start_day =null;
		String last_day=null;
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = now.format(formatter);
		boolean isRun =true;
		while(isRun) {
		
			System.out.println("[1]회원가입 [2]로그인");
			int sel = sc.nextInt();
			switch (sel) {
			
				case 1:
					System.out.println("ID를 입력하세요");
					String user_id = sc.next();
					if(user_id.equals("뒤로가기")) {
						break;
					}
					//if qury에서 모든 name값을 가져와야함. 가져와서 id와 비교. 중복이 있으면 다시.뒤로가기 입력시 메인화면 
					//else
					boolean isRun_pw = true;
					while(isRun_pw) {
						System.out.println("PASSWORD를 입력하세요");
						user_pw = sc.next();

						System.out.println("PASSWORD를 한번 더 입력하세요");
						user_pw2 =sc.next();

						if(user_pw.equals(user_pw2)) {		//PASSWORD 오탈자 방지 
							System.out.println("PASSWORD가 일치합니다.");
							isRun_pw = false;
						}
						else {
							System.out.println("회원가입 실패! PASSWORD가 일치하지 않습니다.");
							isRun_pw = true;
						}
					}
					
					System.out.println("이름을 입력하세요.");
					String user_name =sc.next();
					if(user_name.equals("뒤로가기")) {
						break;
					}
					System.out.println("나이를 입력하세요.");
					int user_age = sc.nextInt();
					if(user_age<20) {
						System.out.println("미성년자는 이용할 수 없습니다.");
						sel=99;
					}else {
						System.out.println("회원가입 성공!");
					}
					start_day = formatedNow;
					last_day ="1994/02/23";
					
					DAO dao = new DAO();
					DTO dto = new DTO(user_id, user_pw, user_name, user_age,start_day,last_day);
					
					
					break;

				case 2:
				
				
					break;
					
				default :
					
					break;
			}
		
		
		
		
		
		
		
		}
	}


}
