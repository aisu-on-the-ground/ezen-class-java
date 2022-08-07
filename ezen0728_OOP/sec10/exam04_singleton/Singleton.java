package ezen0728_OOP.sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	// 싱글톤은 해당 클래스 내에서만 접근할 수 있기 때문에(private) 클래스 내에 객체를 미리 만들어둔다.
	
	private Singleton() {} // 객체를 오직 단 하나만 생성해야 하는 경우! 외부에서 new 연선자로 생성자를 호출할 수 없도록 막아야 한다.
	// 따라서 생성자 앞에 private 접근제한자를 붙여준다.
	
	static Singleton getInstance() {
		return singleton;
	}
}

