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
			
			System.out.println(Outter.this.field);
			
			Outter.this.method();
			// 바깥클래스에서도 this로 호명하지만 내부 클래스와 겹치므로 클래스이름을 붙여줌.
			// Outter의.해당클래스의.메소드();
		}
	}
}
