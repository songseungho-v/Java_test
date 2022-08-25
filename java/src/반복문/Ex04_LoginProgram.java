package 반복문;

import java.util.Scanner;

public class Ex04_LoginProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String ID = "thdtmdgh";
		final String PASS = "tmdgh123";

		while (true) {
			System.out.print("ID를 입력하세요 : ");
			String id = sc.next();
			System.out.print("PASSWORD를 입력하세요 : ");
			
			String pass = sc.next();
			if (id.equals(ID) && pass.equals(PASS)) {
				System.out.println("로그인 성공!");
				System.out.println("'" + ID + "'" + "님 환영합니다.");
				break;
			} else {
				System.out.println("로그인 실패!");
			}
		}
		sc.close();
	}

}
