package 반복문;

import java.util.Scanner;

public class Ex10_Squ {

	public static void main(String[] args) {
		//input : two number
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int base = sc.nextInt();
		System.out.print("제곱입력 : ");
		int n = sc.nextInt();
		int result =1;
		
		for(int num = 1;num<(n+1);num++) {
			result*=base;
		}System.out.println("ans : "+result);
		
		
	sc.close();	
	}

}
