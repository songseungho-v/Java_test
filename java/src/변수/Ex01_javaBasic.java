package 변수;

import java.util.Scanner;

public class Ex01_javaBasic {

	public static void main(String[] args) {

		// 논리 1byte
		boolean a = true;
		// 문자 2byte
		char b = 'a';
		char b1 = 65; // aski code
		// 기본 데이터 파일이 아님. 개발자들이 만들어 놓은 JRE에서 String class를 제공.
		String bb = "hi";
		// 정수 1byte
		byte c = 124;
		// 정수 2byte
		short d = 129;
		// 정수 4byte
		int e = 2000000000;
		// 정수 8byte
		long f = 3000000000l;
		// 실수 4byte
		float g = 300.00f;
		// 실수 8byte
		double h = 30000.23;

		// 상수
		final int FINALI = 1234;

		// CamelCase
		int backgroundCorol = 256;
		// PascalCase
		int BackgroundColor = 256;
		// SnakeCase
		int background_color = 256;
		// HungarianNotation
		int intBackgroundColor = 256;

		// 자동(묵시적)형 변환 int => long
		System.out.println("변환이전 e값 f값 : " + e + f);
		f = e; // f가 큰타입이므로 따로명시하지 않아도 변환이 이루어짐.
		System.out.println("변환이후 f값" + f);

		// 강제(명시적)형 변환 short => byte
		System.out.println("강제적 형변환 d값 c값 " + d + c);
		c = (byte) d;
		System.out.println(c);
		System.out.println((byte) d);
		System.out.println((int) d);
		System.out.println((short) d);
		System.out.println((long) d);

		// 변수 num 값 중에서 백의 자리 미만을 버리는 코드. ex num이 456이라면 400출력

		Scanner sc = new Scanner(System.in);
		// 1번
		int input1 = sc.nextInt();
		System.out.println(input1 / 100 * 100);
		// 2번
		int input2 = sc.nextInt();
		System.out.println(input1 - (input1 % 100));
		// 3번
		int input3 = sc.nextInt();
		System.out.println((input1 / 100) + "00");

		// 두 개의 정수를 입력 받아 두 수의 더라기 빼기 곱하기 나누기(몫) 출력

		System.out.print("첫번째 정수 입력 : ");
		int input4 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int input5 = sc.nextInt();

		System.out.println("두 수의 더하기 : " + (input4 + input5));
		System.out.println("두 수의 빼기 : " + (input4 - input5));
		System.out.println("두 수의 곱하기 : " + input4 * input5);
		System.out.println("두 수의 나누기(몫) : " + input4 / input5);

		// 대입연산자
		int j = 10;
		j = j + 3;
		System.out.println(j);

		int k = 10;
		k += 3;
		System.out.println(k);
		k *= 3;
		System.out.println(k);
		k /= 3;
		System.out.println(k);
		k -= 3;
		System.out.println(k);
		k %= 3;
		System.out.println(k);

		// 비교연산자

		System.out.println(c > b);
		System.out.println(c==b);
		System.out.println(c!=b);
		System.out.println(c>=b);
		
		// 논리연산자 
		//not
		System.out.println(!a);
		//and 곱연산 
		System.out.println(c==b && c<b);
		//or 연산자 
		System.out.println(c==b || c>b);
		
		//증감연산자
		int l = 20;
		System.out.println(l++);
		System.out.println(l--);
		System.out.println(++l);
		System.out.println(--l);

		
	}

}
