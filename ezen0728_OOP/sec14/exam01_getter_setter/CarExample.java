package ezen0728_OOP.sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		
		System.out.println(myCar.isStop()); // private boolean 타입 인스턴스 필드인 stop의 값을 불러옴
											// 따로 초기값 설정을 하지 않았기 때문에 기본 초기화로 인해 false
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
