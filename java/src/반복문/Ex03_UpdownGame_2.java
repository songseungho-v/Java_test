package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex03_UpdownGame_2 {

	public static void main(String[] args) {
		Random random = new Random();
		int rdnum = random.nextInt(20) + 1;

		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		while (true) {
			if (cnt < 5) {
				System.out.print("number : ");
				int innum = sc.nextInt();
				cnt++;

				if (rdnum > innum) {
					if (cnt != 5) {
						System.out.println("up");
					}
				} else if (rdnum < innum) {
					if (cnt != 5) {
						System.out.println("down");
					}
				} else {
					System.out.println("success");
					System.out.print(cnt + "번만에 맞추셨습니다.");
					break;
				}
			} else {
				System.out.println("Fail");
				break;
			}
		}

		sc.close();
	}

}
