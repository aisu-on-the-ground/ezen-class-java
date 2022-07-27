package AddExercise;

public class Exercise09 {

	public static void main(String[] args) {
		// 863은 소수인가? 2~100 사이의 소수를 출력

		int i;
		int j;
		int number = 863;

		// Q1. 863은 소수인가?
		for (i = 2; i <= number; i++) {
			if (number % i == 0 && i == number) {
				System.out.println(number + "은 소수입니다.");
			} else if (number % i == 0 && i < number) {
				System.out.println(number + "은 소수가 아닙니다.");
				break;
			}
		}

		System.out.println("--------------");

		// Q2. 2~100 사이의 소수를 출력
		for (i = 2; i <= 100; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0 && j == i) {
					System.out.println(i + "은 소수입니다.");
				} else if (i % j == 0 && j < i) {
					break;
				}
			}
		}

	}
}