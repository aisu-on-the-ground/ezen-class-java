package ezen0809_APIs.sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone); 
		// print문의 매개변수로 객체를 주면
		// 객체의 toString()메소드 리턴값을 받아 출력하도록 되어있다.
		// 약속이니까 그냥외워
	}
}
