package Exercise_ControlStatement;

public class Exercise11 {

	public static void main(String[] args) {
		// 피보나치 수열에서 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하기

		int j;
		int i;
		int sum = 0;
		for (j = 1; j <= 10; j++) { // J=1. 제 1항.
			i = j - 1;
			sum = sum + j;
		}
		System.out.println("피보나치 수열의 " + (j - 1) + "번째 수는" + sum + "이다.");
		// 피보나치 수열은 다음과 같다.  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	}
}
