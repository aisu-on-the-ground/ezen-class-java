package ezen0728_OOP.sec08.exam03_method_call;

public class Calculator {
	//필드
	//생성자
	//메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { // 메소드 내에서 다른 메소드 실행 1번째.
		double sum = plus(x, y); // 나눗셈의 결과값이 소수로 나오는 경우를 고려해 미리 double형으로 형변환을 해준다.
		double result = sum / 2;
		return result;
	}
	
	void execute() { // 메소드 내에서 다른 메소드 실행 2번째. execute = 실행
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}	
}

