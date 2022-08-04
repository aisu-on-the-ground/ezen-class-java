package Exercise_ControlStatement;

public class Exercise04S {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) { 
			if (i != 6 && i != 7) { // i 값이 6과 7이 '아닌 경우만' (&& = and)
				for (int j = 1; j <= 9; j++) { 
					System.out.println(i * j); 
					
					// 6단과 7단이 아닌 경우에만 for문을 실행시키면
					// 자연스럽게 6단과 7단일 때 아무 것도 실행되지 않고
					// 따로 6단과 7단일 때 continue 하지 않아도 된다
					// 이쪽이 더 효율적인 방법
				}
			} 
		} 
	}
}