package 반복문;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (num < 11) {
			System.out.print("정수입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");

		sc.close();
	}

}
