package java_festival;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {

		Random random = new Random();
		int[] lot_num = new int[6];

		for (int i = 0; i < lot_num.length; i++) {
			int rd_num = random.nextInt(45) + 1;
			lot_num[i] = rd_num;
			for (int j = 0; j < i; j++) {
				if (lot_num[i] == lot_num[j]) {
					i--;
				}
			}
		}
		for (int temp : lot_num) {
			System.out.println("행운의 숫자 : " + temp);
		}
	}
}
