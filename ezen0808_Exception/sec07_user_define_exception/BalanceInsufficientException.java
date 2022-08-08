package ezen0808_Exception.sec07_user_define_exception;

public class BalanceInsufficientException extends Exception { // 예외 클래스 타입을 상속받아서 사용자 정의 예외 클래스를 만든다.
	public BalanceInsufficientException() { }
	// 기본 생성자를 호출할 경우 부모인 Exception의 기본 생성자가 자동 실행됨.
	public BalanceInsufficientException(String message) {
		super(message); // 부모인 Exception의 생성자를 호출하는 부분
	}
}

