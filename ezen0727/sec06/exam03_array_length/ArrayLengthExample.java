package ezen0727.sec06.exam03_array_length;
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length; //분모를 배열의 크기로 지정
		System.out.println("평균 : " + avg);
	}
}
