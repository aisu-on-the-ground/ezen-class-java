package ezen0728_OOP.sec07.exam04_other_constructor_call;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color = "현대자동차";
	int maxSpeed;
	
	//생성자  // 같은 클래스 내에 있는 생성자는 this로 부를 수 있다.. 라고 하네
			// 매개변수로 뭘 넣냐에 따라 그 형식과 같은(매개변수 타입과 갯수가 같은) 생성자를 갖다 쓸 수 있다!
	Car() {
	}
	
	Car(String model) {
		this(model, null, 0);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

