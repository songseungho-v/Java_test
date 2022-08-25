package 반복문;

public class Ex19_WriteStarPyramid {

	public static void main(String[] args) {
		
		
		for(int j =1; j<7;j++) {
			for(int i = 0;i<6-j;i++) {
				System.out.print(" ");
			}
			for(int i =4;i<3+2*j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
