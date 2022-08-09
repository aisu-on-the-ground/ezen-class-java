package ezen0801_Inheritance.sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		//Phone는 추상클래스이므로 직접 객체를 생성하지 못한다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); //오버라이드된 메소드.
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
