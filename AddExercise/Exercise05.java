package AddExercise;

public class Exercise05 {

	public static void main(String[] args) {
		// 1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 출력

		int i;
		int sum = 0;

		for (i = 1; i <= 200; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} else {
				sum += i;
			}
		}
		System.out.println("총합은 " + sum);
	}
}
