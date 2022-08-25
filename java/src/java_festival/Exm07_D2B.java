package java_festival;

import java.util.ArrayList;
import java.util.Scanner;

public class Exm07_D2B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력>>");
		int num = sc.nextInt();
		
		ArrayList<Integer> binary= new ArrayList<Integer>(); 
		
		
		while(true) {
		if(num!=0) {
			binary.add(num%2);
			num=num/2;
		}
		else {
			break;
		}
		}
		for(int i=binary.size()-1;i>-1;i--) {
			System.out.print(binary.get(i)+" ");
		}

	}

}
