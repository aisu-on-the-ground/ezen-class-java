package ezen0808_Exception.verify.exam07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {} // 기본 생성자. 문제 없음.
	public NotExistIDException(String message) { // 매개 변수를 갖는 생성자
		super(message); // 매개 변수를 갖는 경우 같은 시그니처의 부모 클래스 생성자를 명시해주어야 함.
	}
}
