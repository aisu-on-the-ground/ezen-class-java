package ezen0804_Nested.sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.wake();
		//익명 객체 로컬변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		
		
		anony.method2(
			new Person() { // 익명개체 만들어 사용. 메소드 실체화도 동시에 이루어진다.
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}
}
