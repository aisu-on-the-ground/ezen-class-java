package Exercise_ControlStatement;

public class Exercise04 {

	public static void main(String[] args) {
		// 7?¨κ³Ό 6?¨μ?? ???Έν??κ³? κµ¬κµ¬?¨μ?? μ¶???

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
