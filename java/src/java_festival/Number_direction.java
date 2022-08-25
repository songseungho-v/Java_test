package java_festival;

import java.util.Scanner;

public class Number_direction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정수 입력 및 입력정수크기 배열 방 생성.
		System.out.print("정수 입력 : ");
		int innum = sc.nextInt();

		boolean dir = false;
		int[][] innum_arrays = new int[innum][innum];
		// =========================================

		int cnt = 0;
		for (int i = 0; i < innum_arrays.length; i++) {
			for (int j = 0; j < innum_arrays[i].length; j++) {
				cnt++;
				innum_arrays[i][j] = cnt; // 0,0 0,1 0,2 .... 4.0 4.1 ..에 순서대로 cnt넣기.
			}
		}
		// 출력=======================================
		for (int i = 0; i < innum_arrays.length; i++) {

			if (!dir) {			//방향이 정방향일경우 
				for (int j = 0; j < innum_arrays[i].length; j++) {
					System.out.print(innum_arrays[i][j] + "\t");
				}
				dir = true;			//for문 완료 후 역방향으로 변경 
				System.out.println();

			} else {				//방향이 역방향일경우 
				for (int j = innum_arrays[i].length - 1; j > -1; j--) {
					System.out.print(innum_arrays[i][j] + "\t");
				}
				dir = false;			//for문 완료 후 정방향으로 변경 
				System.out.println();

				}
		}
	}
}
