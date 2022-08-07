package ezen0727.sec06.exam08_advanced_for;
public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for (int score : scores) { // for: each 문의 사용  ->  scores 배열의 크기만큼 실행. 조절할 수 없음. 무조건 있는 만큼.
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	} 
}
