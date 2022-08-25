package 반복문;

public class Ex21_PerfectNumber {

	public static void main(String[] args) {
		// 자신을 제외한 약수의 합이 자신과 같은경우

		int result = 0;

		for (int num = 2; num < 10001; num++) {
			for (int dinum = 1; dinum < num; dinum++) {
				if (num % dinum == 0) {
					result += dinum;
				}
			}

			if (num == result) {
				System.out.println(result + "\t is PerfectNumber!");
			}
			result = 0;
		}
	}
}
