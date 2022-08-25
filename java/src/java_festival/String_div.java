package java_festival;

public class String_div {

	public static void main(String[] args) {
		String score="A,A,B,C,D,A,C,D,D,D,F";
		
		
		String[] div_str = score.split(",") ;
		
		int[] people_num= {0,0,0,0,0};
		String[] grade = {"A","B","C","D","F"};
		
		for(int j=0;j<people_num.length;j++) {
			for(int i=0;i<div_str.length;i++) {	

				if(div_str[i].equals(grade[j])) {
					people_num[j]++;
				}
			}
		}
		//출력
		for(int i=0;i<grade.length;i++) {
			System.out.print(grade[i]+" : ");
			System.out.println(people_num[i]+"명");
		}
	}
}

