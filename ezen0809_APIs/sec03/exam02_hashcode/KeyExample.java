package ezen0809_APIs.sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		String value1  = hashMap.get(new Key(1));
		System.out.println(value1);
		// hashCode()메소드를 number필드의 값으로 재정의 했기 때문에 논리적 동등으로 취급.
		// 즉, Key객체의 인스턴스 필드 number의 값만 동일하면 (예제의 경우 1) 같은 식별키로 인식한다.

		
		Object obj = new Object();
		System.out.println(obj); // 객체 obj의 메모리번지
		System.out.println(obj.hashCode()); // 객체 obj를 식별할 수 있는 하나의 정수값
	}
}


