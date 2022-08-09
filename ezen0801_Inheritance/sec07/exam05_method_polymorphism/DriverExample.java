package ezen0801_Inheritance.sec07.exam05_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //부모타입(Vehicle) 매개변수가 들어가는 자리에 자식클래스인 Bus타입 형 변수 bus가 들어감. 문제없음.
		driver.drive(taxi);
	}
}
