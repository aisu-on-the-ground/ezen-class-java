package AddExercise;

public class Exercise08 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 와 같은 식으로 계속 더해나갔을 때
		// 몇까지 더해야 총합이 100 이상이 되는지 출력

		int i = 1;
		int sum = 0;

		while (sum < 100) {
			if (i % 2 == 1) {
				System.out.print(sum + " + ");
				sum += i;
				System.out.println(+i + "는 " + sum);
				i++;
			} else if (i % 2 == 0) {
				System.out.print(sum + " - ");
				sum -= i;
				System.out.println(+i + "는 " + sum);
				i++;
			}
		}
		System.out.println(i + "을 더해야 총 합이 100 이상이 된다.");
	}
}
