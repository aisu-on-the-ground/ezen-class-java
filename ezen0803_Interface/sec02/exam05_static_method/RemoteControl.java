package ezen0803_Interface.sec02.exam05_static_method;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 // default처럼 static도 따로 앞에 붙여서 사용할 수 있다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
