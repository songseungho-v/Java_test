package 반복문;

public class Ex18_WriteStar2 {

	public static void main(String[] args) {
		
		for(int j=1;j<5;j++) {
			for(int i=0;i<5-j;i++) {
				System.out.print(" ");
			}
			for(int i=5;i<5+j;i++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
