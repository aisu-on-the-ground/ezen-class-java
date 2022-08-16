package ezen0815_Generic.sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100); 
		int intValue = box1.get();
		// 이 메소드는 <Integer> 타입의 데이터만 매개변수로 받고 리턴타입은 Box<Integer> 타입이다.
		
		
		Box<String> box2 = Util.boxing("홍길동");
		// boxing 앞에 제네릭 <String>이 명시적으로 써있지 않다면, JAVA가 이를 추정해서 판단.
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
