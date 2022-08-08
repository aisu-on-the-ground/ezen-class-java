package ezen0808_Exception.sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			System.out.println("e.getMessage() = " + e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}

