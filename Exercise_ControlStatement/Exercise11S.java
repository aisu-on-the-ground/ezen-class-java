package Exercise_ControlStatement;

public class Exercise11S {

	public static void main(String[] args) {
		// 피보나치 수열에서 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하기

		int num1, num2, sum;
		num1 = 0; // 첫번째와 두번째 값이 1이어야 하므로 초기값을 0과
		num2 = 1; // 1로 줌
		sum = 0;

		for (int i = 1; i < 10; i++) {
			// System.out.print(sum+" ");
			sum = num1 + num2; // 두 값을 더한 후
			num1 = num2; // num2 값을 num1로 넘겨줌
			num2 = sum; // 두번째 연산자에 더한 값을 넣어줌.
			System.out.println(sum); // sum 값 변하는 것 관찰용
		}
		System.out.println("10번째 수는 " + sum);
	}
}
