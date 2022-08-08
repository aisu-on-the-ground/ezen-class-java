package ezen0803_Interface.sec02.exam05_static_method;

public class a implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("턴 온 a");
	}

	@Override
	public void turnOff() {
		System.out.println("턴 오프 a");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("셋 볼륨 a : " + volume);

	}


}
