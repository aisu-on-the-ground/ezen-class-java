package Exercise_ControlStatement;

public class Exercise06 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 1000까지의 숫자 중 3의 배수만 더하는 코드를 작성하여 결과를 출력

		int i;
		int sum = 0;

		for (i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
			} else {	// else문 생략가능.
				continue;
			}
		}
		System.out.println("총합은 " + sum);
	}
}
