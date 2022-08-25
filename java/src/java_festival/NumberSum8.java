package java_festival;

import java.util.Scanner;

public class NumberSum8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		String indata = sc.next();

		String[] div_str = indata.split("");
		int sum = 0;
		for (int i = 0; i < div_str.length; i++) {
			sum += Integer.parseInt(div_str[i]);
		}

		System.out.println("합은 " + sum + "입니다.");

	}
}
