package ezen0801_Inheritance.sec07.exam04_array_management;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		//Car형 객체 안에는 Car에서 정의한
		//Tire[] tires 필드가 존재.
		//이 배열의 원소들에는 Tire의 자식타입인 한국, 금호타이어의 객체가 자동형변환되어 대입될 수 있음.
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("----------------------------------------");
		}
	}
}
