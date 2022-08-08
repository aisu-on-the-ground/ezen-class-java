package ezen0808_Exception.sec05_try_with_resources;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	
	// 예외처리 할 때 자동으로 close()를 실행하는 방법이 있다. 의 느낌으로 볼 것.
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception { // 예외가 발생하든 안하든 자동호출 된다.
		System.out.println(file + "을 닫습니다.");
	}
	
}
