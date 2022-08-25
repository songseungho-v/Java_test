package 반복문;

public class Ex09_Plus2 {

	public static void main(String[] args) {
		// 1~100+
		// 1-2+3-4.....-100
		// (77*1)+(76*2)+(76*3).....
		int result = 0;
		for (int num = 1; num < 101; num++) {
			result += num;
		}
		System.out.println(result);
		result = 0;

		for (int num = 1; num < 101; num++) {
			if (num % 2 == 0) {
				result += -num;
			} else
				result += num;
		}
		System.out.println(result);
		result =0;
		
		int cnt = 1;
		for (int num = 77; num > 0; num--) {
			result +=(cnt*num);
			cnt++;
		}
		System.out.println(result);

	}

}
