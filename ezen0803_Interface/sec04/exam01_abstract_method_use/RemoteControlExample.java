package ezen0803_Interface.sec04.exam01_abstract_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-5);
		
	}
}
