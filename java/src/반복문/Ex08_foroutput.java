package 반복문;

public class Ex08_foroutput {

	public static void main(String[] args) {
		// 21~57 1+
		// 96~53 1-
		// 21~57 odd

		for (int num1 = 21; num1 < 58; num1++) {
			System.out.print(num1 + " ");
		}
		
		System.out.println();
		for (int num1 = 96; num1 > 52; num1--) {
			System.out.print(num1 + " ");
		}
		
		System.out.println();
		for (int num1 = 21; num1 < 58;num1++) {
			if(num1%2==1) 
			System.out.print(num1 + " ");
		}

	}

}
