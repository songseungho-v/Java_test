package 반복문;

public class Ex15_2Dan9Dan2 {

	public static void main(String[] args) {
		
		int result;
		
		for(int dan=2;dan<10;dan++) {
			System.out.print(dan+"단 : ");
			for(int cnt =1; cnt<10; cnt++) {
				result = dan*cnt;
				System.out.print(dan+"*"+cnt+"="+result+" ");
			}System.out.println();
		}
	}

}
