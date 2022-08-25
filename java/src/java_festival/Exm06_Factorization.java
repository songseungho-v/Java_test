package java_festival;

import java.util.Scanner;

public class Exm06_Factorization {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소인수분해할 숫자 입력 : ");
		int num = sc.nextInt();
		
		//최소의 수로 나누었을때 나머지가 0이여야함.

		for(int i =2; i<num+1;i++) {	
			while(true)
				if(num%i==0) {
					num=num/i;
					System.out.print(i+" ");
				}
				else
					break;
		}
	}

}
