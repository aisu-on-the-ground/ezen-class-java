package Exercise_ControlStatement;

public class Exercise04 {

	public static void main(String[] args) {
		// 7?�과 6?��?? ???��??�? 구구?��?? �???

		for (int i = 2; i <= 9; i++) {
			if (i == 7 || i == 6) {
				continue;
			} else {
				System.out.println("[" + i + "??]");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		}
	}
}
