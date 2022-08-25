package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex07_PlusGame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		while (cnt < 3) {
			int rdnum1 = random.nextInt(20) + 1;
			int rdnum2 = random.nextInt(20) + 1;
			System.out.print(rdnum1 + " + " + rdnum2 + " = ");
			int ans = sc.nextInt();
			int result = rdnum1 + rdnum2;

			if (ans == result) {
				System.out.println("Success!");
			} else {
				System.out.println("Fail...");
				cnt++;
			}
		}
		System.out.println("Game Over!");
		sc.close();
	}

}
