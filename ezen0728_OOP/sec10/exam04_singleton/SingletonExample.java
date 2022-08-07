package ezen0728_OOP.sec10.exam04_singleton;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton();  //컴파일 에러
		Singleton obj2 = new Singleton();  //컴파일 에러
		*/
		 
		Singleton obj1 = Singleton.getInstance(); // 생성자를 통해 만드는 것이 아니라
		Singleton obj2 = Singleton.getInstance(); // 선언 후에 getInstance로 클래스 내부에 만들어둔 객체를 선언한 참조변수에 저장해서 쓰는 개념
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
