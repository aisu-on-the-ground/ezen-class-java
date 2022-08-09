package ezen0801_Inheritance.sec07.exam05_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) { //매개변수의 타입을 부모 데이터타입으로 정의
		vehicle.run();					//자식인 Taxi, Bus타입이 들어와도 자동형변환되어 문제 없음.
	}
}
