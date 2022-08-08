package ezen0808_Exception.sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2"); 
		// 여기서 예외 처리를 하지 않고 findClass() 메소드를 사용하는 쪽에서 예외 처리를 하도록 떠넘긴다.
	}
}

