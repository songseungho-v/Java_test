package 반복문;

public class Ex14_2Dan9Dan {

	public static void main(String[] args) {

		int result = 0;

		for (int dan = 2; dan < 10; dan++) {
			System.out.println("=="+dan+"단==");
			for (int cnt = 1; cnt < 10; cnt++) {
				result = dan * cnt;
				System.out.println(dan + " * " + cnt + " = " + result);
			}
			System.out.println();
		}

	}

}
