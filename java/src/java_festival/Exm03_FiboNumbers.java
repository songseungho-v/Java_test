package java_festival;

import java.util.Scanner;

public class Exm03_FiboNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		 
		int cnt1=1;
		int cnt2=1;
		int cnt3=0;
		System.out.print(cnt1+ " ");
		System.out.print(cnt2+ " ");
		for(int i =0; i<num-2;i++) {
			cnt3=cnt1+cnt2;
			System.out.print(cnt3+ " ");
			cnt1=cnt2;
			cnt2=cnt3;
		}

	} 

}
