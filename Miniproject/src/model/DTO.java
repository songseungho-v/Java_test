package model;

public class DTO {
	private String  user_id;
	private String user_pw;
	private String user_name;
	private int age;
	private int level;
	private int rank;
	private int coin;
	private int ex;
	private String grade;
	private String start_day;
	private String last_day;
	
	public DTO(String user_id, String user_pw, String user_name, int age, int level, int rank, int coin, int ex,
			String grade, String start_day, String last_day) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.age = age;
		this.level = level;
		this.rank = rank;
		this.coin = coin;
		this.ex = ex;
		this.grade = grade;
		this.start_day = start_day;
		this.last_day = last_day;
	}
	//회원가입용
	public DTO(String user_id,String user_pw,String user_name,int age,String start_day,String last_day) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.age = age;
		this.start_day = start_day;
		this.last_day = last_day;
	}
	
	
	public String getUser_id() {
		return user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public int getAge() {
		return age;
	}

	public int getLevel() {
		return level;
	}

	public int getRank() {
		return rank;
	}

	public int getCoin() {
		return coin;
	}

	public int getEx() {
		return ex;
	}

	public String getGrade() {
		return grade;
	}

	public String getStart_day() {
		return start_day;
	}

	public String getLast_day() {
		return last_day;
	}
	
	
}
