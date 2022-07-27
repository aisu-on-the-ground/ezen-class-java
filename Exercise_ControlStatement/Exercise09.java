package Exercise_ControlStatement;

public class Exercise09 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.

		int sum = 0;

		for (int i = 1; i <= 10; i++) { // 합산의 범위를 1씩 증가 시킴
			for (int j = 1; j <= i; j++) { // 1부터 제어한 범위까지의 수를 모두 더하는 것을 반복
				sum += j;
			}
		}
		System.out.println(sum);
	}
}