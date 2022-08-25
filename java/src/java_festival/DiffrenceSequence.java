package java_festival;

import java.util.Scanner;

public class DiffrenceSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int minus_cnt=0;
		int dis_num=1;
		
		for(int i=0; i<n;i++) {	
			dis_num+=minus_cnt;
			minus_cnt++;
			System.out.print(dis_num+" ");	
		}
	}
}
