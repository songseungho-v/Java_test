package java_festival;

import java.util.Random;

public class Exm05_Lotto {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] rdarrays = new int[6];
		
		for(int i =0; i<6; i++) {
			rdarrays[i] = rd.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(rdarrays[i]==rdarrays[j]) {
					i--;
				}
				
			}	
		}
		for(int temp : rdarrays) {
			System.out.println("행운의 숫자 :" + temp);
		}
		
		
		

	}

}
