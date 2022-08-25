package 반복문;

public class Ex20_Divisor2_30 {

	public static void main(String[] args) {
		
		for(int n=2;n<31;n++) {
			System.out.print(n+"의 약수 : ");
			for(int cnt=1;cnt<n+1;cnt++) {
				if(n%cnt==0)
					System.out.print(cnt+" ");
			}System.out.println();
		}
	}

}
