package java_festival;

public class GetMiddle {

	public static void main(String[] args) {

		
		System.out.println(getMiddle("test"));
	}
	
	
	public static String getMiddle(String word) {
		String divword;
		if(word.length()%2==0){
			
			divword = word.substring((word.length()/2)-1,(word.length()/2)+1);
		}
		else {
			divword = word.substring((word.length()/2),(word.length()/2)+1);
		}
		return divword;
	}
	
}
//word="power"
//system.out.plintln(word.substring(1,5))
