package 반복문;

public class Ex16_2Dan9Dan3 {

	public static void main(String[] args) {

		int result;

		for (int jump = 2; jump < 10; jump += 3) {
			for (int cnt = 1; cnt < 10; cnt++) { // 9 OUTPUT

				for (int dan = jump; dan < jump + 3; dan++) { // 3 OUTPUT
					result = dan * cnt;
					System.out.print(dan + " * " + cnt + " = " + result + "	");
				}
				System.out.println();

			}
			System.out.println();
		}
	}

}
