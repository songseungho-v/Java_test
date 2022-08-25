package java_festival;

import java.util.Scanner;

public class Exm02_HierarchicalSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int sum=1;
		int cnt=0;
		for(int i =0; i<n; i++) {
			sum+=cnt;
			cnt++;
			System.out.print(sum+ " ");
		}
	}

}
