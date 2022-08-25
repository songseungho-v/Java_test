package 반복문;

import java.util.Scanner;

public class Ex12_InputDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		int result = 0;
		for (int cnt = 1; cnt < 10; cnt++) {
			result = input * cnt;
			System.out.println(input + " * " + cnt + " = " + result);
		}
sc.close();
	}

}
