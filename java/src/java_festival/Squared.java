package java_festival;

public class Squared {

	public static void main(String[] args) {
		int base =2;
		int n =3;
		int result = powerN(base,n);
		System.out.println("결과 확인 : "+result);

	}
	public static int powerN(int base,int n) {
		int data=1;
		for(int i =0;i<n;i++) {
			
			data*=base;
		}
		return data;
		
	}

}
