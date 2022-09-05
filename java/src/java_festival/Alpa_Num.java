package java_festival;

import java.util.Scanner;

public class Alpa_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 대소문자 구별이 없이.
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		
		String[] data = sc.nextLine().split("");

		int[] alpacnt = new int[26];
		char alpa1 = 'a';
		char alpa2 = 'A';

		for (int j = 0; j < data.length; j++) {
			for (int i = 0; i < alpacnt.length; i++) {  
					//입력값    ==    스트링으로 바꾼 소문자         입력값    
				if ((data[j].equals(String.valueOf(alpa1))||(data[j].equals(String.valueOf(alpa2))))) {
					alpacnt[i]++;
				}
				if (alpa1 == 'z') {
					alpa1 = 'a';
					alpa2 = 'A';
				} else {
					alpa1++;
					alpa2++;
				}
			}
		}
		char cnt = 'a';
		for (int i = 0; i < alpacnt.length; i++) {
			System.out.println(cnt + " : " + alpacnt[i]);
			cnt++;
		}

	}

}
