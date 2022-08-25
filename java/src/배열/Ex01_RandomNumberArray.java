package 배열;

import java.util.Random;

public class Ex01_RandomNumberArray {

	public static void main(String[] args) {
		
		
		int sum=0;
		double size = 10;
		int[] rdarray = new int[(int)size];
		Random random = new Random();
		
		
		for(int i=0;i<size;i++) {
			int rdnum = random.nextInt((int) size);
			rdarray[i] = rdnum;
			
			for(int j =0; j<i;j++) {
				if(rdarray[i]==rdarray[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println((i+1)+"번째 인덱스 : "+rdarray[i]+" ");
			
		}	
//4번째 9번째 더하여 값 출력 
		System.out.println("4번째 9번째 값 합 : " +(rdarray[3]+rdarray[8]));
//각 인덱스에 들어있는 값의총합.
		for(int i=0;i<size;i++) {
			sum += rdarray[i];
		}
		System.out.println("총합" +sum);
//배열 안에 있는 수의 평균
		System.out.println("평균 "+ sum/size);
//홀수출력
		int cnt=0;
		System.out.print("array에 들어있는 홀수는 ");
		for(int i=0;i<size;i++) {
			if(rdarray[i]%2!=0) {
				System.out.print(rdarray[i]+" ");
				cnt ++;
			}
		
			
		}System.out.println("이며, 총 "+cnt+"개 입니다.");	
	}

}

