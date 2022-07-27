package Exercise_ControlStatement;

public class Exercise02 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 76까지의 합을 출력
		int i;
		int sum = 0;
		for (i = 1; i <= 76; i++) {
			sum += i;
		}
		System.out.println("1부터 " + (i-1) +"까지의 합은 " + sum);
	}
}