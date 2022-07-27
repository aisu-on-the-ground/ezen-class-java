package AddExercise;

public class Exercise07 {

	public static void main(String[] args) {
		// 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해나갈 때
		// 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지
		// 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력

		int i = 1;
		int sum = 0;

		while (sum < 1000) {
			if (i % 2 == 1 || (i % 2 == 0 && i % 3 == 0)) { // (i %6 == 0) 과 결과 비교해보기
				sum += i;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(i + "를 더할 때 " + sum + "의 값으로 1000을 넘어선다.");
	}
}
