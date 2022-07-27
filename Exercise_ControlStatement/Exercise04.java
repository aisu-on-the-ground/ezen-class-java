package Exercise_ControlStatement;

public class Exercise04 {

	public static void main(String[] args) {
		// 7단과 6단을 제외하고 구구단을 출력

		for (int i = 2; i <= 9; i++) {
			if (i == 7 || i == 6) {
				continue;
			} else {
				System.out.println("[" + i + "단]");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		}
	}
}
