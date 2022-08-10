package ezen0809_APIs.sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
	
		//대입시 자동 Unboxing
		int value = obj;  //래퍼클래스 객체를 int형 변수에 바로 저장한다.
		System.out.println("value: " + value);
		
		//연산시 자동 Unboxing
		int result = obj + 100; //연산도 가능하다.
		System.out.println("result: " + result);
	}
}

