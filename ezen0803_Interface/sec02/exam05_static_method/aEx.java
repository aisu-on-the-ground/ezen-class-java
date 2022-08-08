package ezen0803_Interface.sec02.exam05_static_method;

public class aEx {

	
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		// 인터페이스의 static 메소드
	
		RemoteControl rc = new RemoteControl() {
		// 익명 구현 객체 사용
			@Override
			public void turnOn() {
			}
			
			@Override
			public void turnOff() {
			}
			
			@Override
			public void setVolume(int volume) {
			}
		};
			


	}
}
