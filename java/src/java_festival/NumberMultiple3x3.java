package java_festival;

import java.util.Scanner;

public class NumberMultiple3x3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		String num1 = sc.next();

		System.out.print("두 번째 숫자 입력>> ");
		String num2 = sc.next();

		// 1. 일의자리부터 곱하기.
		// 2. 결과값이 10이상이면 10의자리를 다음 곱셈의 결과에 더하기.
		// 3. num1의 두번째에 첫번째를 곱하기.

		// 숫자를 나누어 배열에 넣을까?ㅇㅋ
		String[] num1ar = num1.split("");
		String[] num2ar = num2.split("");
		int box = 0;
		int[][] result1 = new int[3][3];
		int pten = 0;
		int last_result = 0;
		// 올림수 곱셈기=============================================
		for (int j = num1ar.length - 1; j > -1; j--) { // 2..1..0
			for (int i = num2ar.length - 1; i > -1; i--) { // 2..1..0
				box = (Integer.parseInt(num2ar[j]) * Integer.parseInt(num1ar[i])) + pten;
				if (box > 9 && i != 0) {
					result1[j][i] = box % 10;
					pten = box / 10;
				} else {
					result1[j][i] = box;
					pten = 0;
				}
			}
		}
		// ======================================================s
//정수로 만들기.
		int tencnt = 1;
		int nextcnt = 1;
		for (int j = result1.length - 1; j > -1; j--) {
			tencnt *= nextcnt;
			for (int i = result1.length - 1; i > -1; i--) {
				last_result += (result1[j][i] * tencnt);
				tencnt *= 10; // 1..10..100 //10..100..1000
			}
			tencnt = 1;
			nextcnt *= 10;
		}
		// 출력
		for (int i = result1.length - 1; i > -1; i--) {
			for (int j = 0; j < result1.length; j++) {
				System.out.print(result1[i][j]);
			}
			System.out.println();
		}
		System.out.println(last_result);

	}

}
