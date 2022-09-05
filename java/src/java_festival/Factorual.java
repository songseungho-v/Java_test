package java_festival;

import java.util.Scanner;

public class Factorual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		int num_d =num;
		for(int i =1; i<num ;i++) {
			
			num_d*=i;
		}System.out.println("출력 : "+num_d);

	}

}
