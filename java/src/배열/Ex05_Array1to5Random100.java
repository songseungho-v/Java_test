package 배열;

import java.util.Random;

public class Ex05_Array1to5Random100 {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int[] onefive= {0,0,0,0,0};
		
		
		
		for(int i=0;i<100;i++) {
			int rdnum = random.nextInt(5)+1;
			for(int j=0;j<onefive.length;j++) {
				if(rdnum==j+1) {
					onefive[j]+=rdnum/(j+1);
				}
			}
		}
		for(int j=0;j<onefive.length;j++) {
			System.out.print((j+1)+" ("+onefive[j]+"개) : ");
			for(int i=0;i<onefive[j];i++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
