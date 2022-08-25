package 반복문;

import java.util.Scanner;

public class Ex05_DietProgam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int now_w = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal_w = sc.nextInt();
		int week_cnt = 1;

		while (true) {
			if (now_w > goal_w) {
				System.out.print(week_cnt + "주차 감량 몸무게 : ");
				int minus = sc.nextInt();
				now_w -= minus;
				week_cnt++;
			} else {
				System.out.println(now_w + "kg 달성!! 축하합니다!");
				break;
			}
		}
		sc.close();

	}

}
