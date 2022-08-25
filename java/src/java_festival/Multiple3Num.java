package java_festival;

import java.util.Scanner;

public class Multiple3Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stor_num = new int[10];
		
		for(int i = 0; i<10; i++) {
			System.out.print((i+1)+"번 째 정수 입력>>");
			stor_num[i] = sc.nextInt();
		}
		System.out.print("3의배수 : ");
		for(int i = 0; i<10; i++) {
			if(stor_num[i]%3==0) {
				System.out.print(stor_num[i]+ " ");
			}
		}
		
sc.close();
	}

}
