package ezen0808_Exception.sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); // 강제로 예외를 발생시키는 부분. throw ~ ~ 
			// ** throws 는 예외를 떠넘기는 키워드. s 붙는 것에 주의
			// throw 뒤에는 예외 클래스의 객체를 생성하는 구문이 온다.
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
