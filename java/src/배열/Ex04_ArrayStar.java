package 배열;

public class Ex04_ArrayStar {

	public static void main(String[] args) {
		int[] starcount = {3,4,4,2,1};
		
		
		for(int j=0;j<starcount.length;j++) {
			System.out.print(starcount[j]+" : ");
			for(int i=0;i<starcount[j];i++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		

	}

}
