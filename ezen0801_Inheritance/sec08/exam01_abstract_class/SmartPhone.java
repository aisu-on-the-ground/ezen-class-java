package ezen0801_Inheritance.sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner); // 부모의 생성자가 기본생성자가 아니므로,
					  // 자식 생성자를 정의할 때 super 키워드를 사용하여 부모의 생성자를 먼저 호출.
					  // 부모 생성자는 매개변수로 String 타입을 받기로 정의되어있다.
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다."); // 자식 클래스인 SmartPhone만이 독립적으로 가진 메소드.
	}
	@Override
	public void turnOn() {
		System.out.println("스마트폰 전원을 켭니다");
	}
	
	
}
