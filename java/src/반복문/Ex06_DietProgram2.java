package 반복문;

import java.util.Scanner;

public class Ex06_DietProgram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int now_weight;
		int goal_weight;
		int cnt = 1;

		System.out.print("현재 몸무게 : ");
		now_weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		goal_weight = sc.nextInt();
		while (true) {
			if (now_weight <= goal_weight) {
				System.out.println("다시 입력해 주세요.");
				System.out.print("목표 몸무게 : ");
				goal_weight = sc.nextInt();
			} else {
				while (true) {
					if (goal_weight < now_weight) {
						System.out.print(cnt + "주차 감량 몸무게 : ");
						int week_weight = sc.nextInt();
						now_weight -= week_weight;

						cnt++;
					} else {
						System.out.println(now_weight + "kg 달성 감량성공");
						break;
					}
				}
				break;
			}
		}
		sc.close();
	}

}
