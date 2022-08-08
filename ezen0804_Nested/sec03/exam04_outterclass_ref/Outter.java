package ezen0804_Nested.sec03.exam04_outterclass_ref;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			//Nested 클래스 내부에서의 this이므로 Nested 클래스를 의미.
			
			System.out.println(Outter.this.field);
			
			Outter.this.method();
			//바깥클래스 입장에서는 자신의(바깥클래스) 필드나 메소드에 접근할 때
			//똑같이 this 키워드로 호명하지만
			//중첩클래스의 경우 내부클래스와 this라는 표현이 겹치므로 바깥클래스이름을 앞에 붙여줌. (정확한 주소 명시)
		}
	}
}
