package java_festival;

public class Exm08_Grade {

	public static void main(String[] args) {
		String grade="A,A,B,C,D,A,C,D,D,D,F";

		
		String[] point= {"A","B","C","D","F"};
		String[] spl_grade = grade.split(",");
		int[] count = new int[5];
		
		for(int j=0;j<point.length;j++) {
			for(int i=0;i<spl_grade.length;i++) {
				if(spl_grade[i].equals(point[j])) {
					count[j]++;
				}
			}
		}
		for(int i=0; i<count.length;i++) {
			
			System.out.println(point[i]+" : "+count[i]+"명");
		}
	}

}
