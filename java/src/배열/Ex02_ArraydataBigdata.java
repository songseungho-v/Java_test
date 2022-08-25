package 배열;

import java.util.Random;

public class Ex02_ArraydataBigdata {

	public static void main(String[] args) {
		int[] arrays = new int[10];

		Random random = new Random();
		int maxnum = 0;
		int minnum = arrays.length;
		for (int i = 0; i < arrays.length; i++) {
			int rdnum = random.nextInt(arrays.length) + 1;
			arrays[i] = rdnum;
		//random equal x	
			for (int j = 0; j < i; j++) {
				if (arrays[i] == arrays[j]) {
					i--;
				}
			}
			if(maxnum<arrays[i])
				maxnum=arrays[i];
			
			if(minnum>arrays[i])
				minnum=arrays[i];
			
		}
		//=================================================

		
		//출력==============================================
		for(int temp:arrays) {
			System.out.println(temp);// random data in array
		}
		System.out.println("max" + maxnum);
		System.out.println("min" + minnum);

	}

}
