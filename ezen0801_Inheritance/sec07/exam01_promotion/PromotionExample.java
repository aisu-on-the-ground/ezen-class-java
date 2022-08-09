package ezen0801_Inheritance.sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();		
		
		A a1 = b; // 자동형변환이 이루어지는 부분.
		A a2 = c; // 자신의 부모 데이터타입이라면 자동형변환이 가능.
		A a3 = d;
		A a4 = e;
		
		B b1 = d; 
		C c1 = e;

		//B b3 = e;
		//C c2 = d;
	}
}

