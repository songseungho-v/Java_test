package 배열;

import java.util.Scanner;

public class Ex03_SequentialSearch {

	public static void main(String[] args) {
		String[] names = {"송승호","이민혁","이성재","변우경","허유리"};
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("입력 >> ");
		String inname = sc.next();
		
		boolean s =false;
		for(int i=0;i<names.length;i++) {
			if(inname.equals(names[i])) {
				System.out.println(inname+"님은 "+i+"번 인덱스에 저장되어 있습니다!");
				s=true;
			}
		}
		if(!s)
			System.out.println("존재하지 않는 이름입니다.");
			sc.close();
	}

}
