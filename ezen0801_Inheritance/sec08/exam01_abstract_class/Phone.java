package ezen0801_Inheritance.sec08.exam01_abstract_class;

public abstract class Phone { // ***** 추상 클래스 *****
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// ***** 추상 클래스 *****
	// 추상이란 여러 실체들이 공통적으로 가지고 있는 특성을 의미
	// 즉, 네이버 라인 카카오 쿠팡 배민은 모두 다 다른 실체이지만 회사라는 공통 특성이 있으므로
	// '회사'라는 개념은 이들이 가지고 있는 추상이라고 할 수 있다.
	// 추상클래스는 자신을 상속받은 자식 클래스들의 공통점만을 뽑아 만든 추상이라고 할 수 있다.
	// 따라서 추상클래스가 스스로 객체를 생성할 수는 없으며
	// 이러한 공통점(추상)을 가진 실체들의 클래스를 만들어 추상클래스로부터 공통점을 상속받아 사용된다.
	
	
	
	
	
	
	
}
