package ezen0803_Interface.sec03.exam01_name_implement_class;

public class RemoteControlEx02 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.setVolume(5);
		
											
		// RemoteControl rc = new Audio();  // '생성'이 중복되는 건 불가
		rc = new Audio();  // 이미 생성된 변수에 다른 객체를 대입하는 것은 ok	
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.setVolume(5);
	}
}
