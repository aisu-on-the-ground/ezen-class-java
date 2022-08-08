package ezen0803_Interface.sec05.exam02_field_array;

public class Car {
	Tire[] tires = {	// 배열의 원소로 객체를 넣을 때. 이런식으로도 넣어줄 수 있음.
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
		System.out.println();
	}
}
