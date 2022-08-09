package ezen0801_Inheritance.sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		  Child child = new Child();
		  
		  child.method1(); //부모에게 상속
		  child.method2(); //오버라이드
		  child.method3(); //자식클래스가 독립적으로 만든 메소드

		  Parent parent = child; //부모 데이터타입으로 자동형변환

		  parent.method1();
		  parent.method2(); //부모타입이 된 지금도 객체 출신은 (new Child()) 이므로
		  					//Child 클래스에 오버라이드 된 메소드를 호출

		  //parent.method3(); //자식클래스에만 있는 메소드이므로 부모타입이 된 지금은 접근할 수 없다.
	}
}
