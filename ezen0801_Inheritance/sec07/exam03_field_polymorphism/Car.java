package ezen0801_Inheritance.sec07.exam03_field_polymorphism;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4); //부모클래스로부터 생성된 부모타입의 객체. 평범함.
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; };
		if(frontRightTire.roll()==false) { stop(); return 2; };
		if(backLeftTire.roll()==false) { stop(); return 3; };
		if(backRightTire.roll()==false) { stop(); return 4; };
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

