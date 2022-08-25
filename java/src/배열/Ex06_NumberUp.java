package 배열;

public class Ex06_NumberUp {

	public static void main(String[] args) {
		
		
		int[][] numbers = new int[5][5];
		
			int dir =0;
			int num=20;
			for(int j=0;j<numbers.length;j++) {
				for(int k=0;k<numbers[j].length;k++) {
					num++;
					numbers[j][k]=num;
					//System.out.print(numbers[j][k]+" ");
				}System.out.println();
			}
			
			for(int j=0;j<numbers.length;j++) {
				if(dir==0) {
					for(int i=0;i < numbers[j].length;i++) {
						System.out.print(numbers[j][i]+" ");
						}
						System.out.println();
						dir=1;
						}
				else {

					for(int i=4;i >-1;i--) {
						System.out.print(numbers[j][i]+" ");
					}System.out.println();
					dir=0;	
				}
			
			}

}}
