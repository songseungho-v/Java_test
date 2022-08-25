package java_festival;

public class Exm04_Alpa {

	public static void main(String[] args) {
		
		char alpa = 'A';
		
		//i=0 j=0~4
		//i=1 j=1~3
		//i=2 j=2~2
		
		//i=3 j=1~3
		//i=4 j=0~4
		
		char[][] alpas = new char[5][5];

		
		for(int i =0; i<5;i++) {
				if(i<3) {
					for(int j=i;j<5-i;j++) {
						alpas[i][j]=alpa++;
					}
				}
				else {
					for(int j =4-i; j<1+i;j++) {
						alpas[i][j]=alpa++;
					}
				
				}	
			}
		
		for(char[] temp : alpas) {
			for(char j : temp) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
