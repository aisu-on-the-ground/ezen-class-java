package ezen0803_Interface.sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn(); // 마찬가지로 앞에 abstract가 생략되어 있다고 이해하기.
	void turnOff(); // 마찬가지로 Outline탭에서 로고 A 확인 가능.
	void setVolume(int volume);
}
