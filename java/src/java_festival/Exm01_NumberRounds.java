package java_festival;

import java.util.Scanner;

public class Exm01_NumberRounds {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int indata = sc.nextInt();
		
		if(indata%10>4)
			indata =((indata/10)*10)+10;
		else
			indata = (indata/10)*10;

			System.out.println("반올림 수 : "+ indata);
	} 

}
