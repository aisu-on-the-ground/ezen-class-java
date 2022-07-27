package ezen0726.sec02.exam01_if;

public class IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int) (Math.random() * 20) + 81;
		// Math.random() 은 0~1 사이의 실수를 랜덤형성 -> 왜 int형으로 변환했는지 이해해야 함.
		
		System.out.println("점수: " + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}

		System.out.println("학점: " + grade);
	}
}
