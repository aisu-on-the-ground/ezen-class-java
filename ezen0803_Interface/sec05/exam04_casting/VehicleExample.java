package ezen0803_Interface.sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run(); // 오버라이딩 된 메소드가 실행.
		//vehicle.checkFare(); (x)

		Bus bus = (Bus) vehicle;  //강제타입변환

		bus.run(); // 오버라이딩 된 메소드가 실행.
		bus.checkFare();
	}
}
