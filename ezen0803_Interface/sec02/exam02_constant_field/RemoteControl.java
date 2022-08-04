package ezen0803_Interface.sec02.exam02_constant_field;

public interface RemoteControl {
	int MAX_VOLUME = 10; // 인터페이스에는 상수만 존재하게 한다.
	int MIN_VOLUME = 0; // static final이 앞에 생략되어있다고 이해하기.
						// Outline 탭을 확인하면 변수 로고에 S F가 붙어있다.
}
