package ezen0801_Inheritance.sec05.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//final 접근제한자가 붙은 메소드는 오버라이딩을 할 수 없음
	//final = "메소드 내용이 한 번 정해지면 수정할 수 없다,"
	
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}

