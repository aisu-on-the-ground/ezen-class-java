package Exercise_ControlStatement;

public class Exercise05S {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 200; i++) {
			if (i % 2 != 0 && i % 3 != 0) { // '2와 3의 배수가 아니면 실행한다'
				sum += i;
			}
		}
		System.out.println(sum);
	}
}