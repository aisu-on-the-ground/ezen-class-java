package Exercise_ControlStatement;

public class Exercise09S {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.

		int sum = 0, total = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i; // () 안에 1씩 증가하는 i값들의 합 저장
			// 즉, sum은 i값이 증가함에 따라
			// 1, (1+2), (1+2+3), ..., (1+2+3+...+10)
			total += sum; // sum의 값을 누적해서 저장
		}
		System.out.println(total);

	}

}

