package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex02_UpdownGame {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int rdnum = random.nextInt(20) + 1;

		while (true) {
			System.out.print("number : ");
			int indata = sc.nextInt();
			if (indata < rdnum) {
				System.out.println("up");
			} else if (indata > rdnum) {
				System.out.println("down");
			} else {
				System.out.println("success");
				break;
			}
		}
		sc.close();
	}

}
