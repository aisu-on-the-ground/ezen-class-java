package ezen0725.sec04.exam01_arithmetic;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
		// 0.2999999993.
		// double이나 float는 0.1을 정확히 표현하지 못하기 때문에 항상 근사값으로 표현 (값의 누락)
	}
}

