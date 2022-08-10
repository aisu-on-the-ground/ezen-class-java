package ezen0809_APIs.sec12.exam01_wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300"); //Boxing의 3가지 방법
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue(); //.intValue()를 사용해 int값으로 뽑을 수 있다.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
