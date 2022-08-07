package ezen0728_OOP.sec08.exam01_method_declaration;

public class Computer {
	int sum1(int[] values) { // *** 매개변수로 몇개의 변수가 들어올지 미리 정해놓을 수 없는 상황에는 매개변수를 배열타입으로 선언하는 방법이 있다
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i]; // 하지만 그만큼 불편한 점도 있는데 메소드를 호출하기 전 매개변수에 들어갈 변수를 배열 변수로 만들어야 하는 불편함이 있다
		}
		return sum;
	}
	
	int sum2(int ... values) { // 그래서 배열을 생성하지 않고 값의 리스트(값만 여러개)를 넘겨주는 방법이 ... 방법이다
		int sum = 0;			// 메소드 호출 시 넘겨준 값의 수에 따라 '자동'으로 '배열이 생성'된다
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
