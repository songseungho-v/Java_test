package java_festival;

import java.util.Scanner;

public class Dec2Bin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력>>");
		int dec_num = sc.nextInt();

		int save_num = dec_num;

		// 2진수를 넣어둘 배열의 크기 정하기.============================
		int array_cnt = 0;
		for (int i = 0; dec_num / 2 != 0; i++) {
			dec_num /= 2; // dec=150(0)...75(0)....37(1).....18(1).....9(0)...
			array_cnt++; // 1 ...2 ....3
		}
		int[] bin_array = new int[array_cnt]; // 3칸 배열.
		//========================================================
		// 2로 나눳을때 나머지가 2진수 자릿수.언제까지 2로 나누기? 몫이 1일때까지
		for (int i = 0; save_num / 2 != 0; i++) {
			bin_array[i] = save_num % 2; // 0.0
			save_num /= 2;
		}
		// 출력====================================================
		System.out.print(save_num + " ");// 몫
		for (int i = array_cnt-1;i > -1; i--) {
			System.out.print(bin_array[i] + " "); // 나머지
		}
	}
}
