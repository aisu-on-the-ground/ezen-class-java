package ezen0809_APIs.sec12.exam01_wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2)); // 값을 벗어났기 때문에 false.
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue())); // 언박싱을 해야만 값을 비교할 수 있다.
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4)); // 범위값 내에 있을 때는 객체간 끼리도 ==연산자로 바로 '값'을 비교 가능.
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}
}
