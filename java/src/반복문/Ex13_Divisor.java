package 반복문;

import java.util.Scanner;

public class Ex13_Divisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int dnum = sc.nextInt();
		
		for(int x =1; x<dnum+1; x++) {
			if(dnum%x==0)
			System.out.print(x+" ");
			
		}
		sc.close();
	}

}
