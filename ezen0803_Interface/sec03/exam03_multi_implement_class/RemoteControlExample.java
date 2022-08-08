package ezen0803_Interface.sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.setVolume(5);
		// rc.search();
		// SmartTelevision엔 있지만 RemoteControl엔 없으므로 불가.
		
		Searchable sc = tv;
		sc.search("www.naver.com");
		// sc.turnOn();
		// 마찬가지. RemoteControl엔 있지만 
		// 현재는 Searchable 타입이므로 Searchable에 없는 것은 불가.
	}
}
