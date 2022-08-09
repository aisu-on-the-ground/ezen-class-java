package ezen0809_APIs.sec04.exam01_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		//래퍼클래스 Integer
		//원래는 new Integer(1000); 으로 생성해야 하지만
		//래퍼클래스와 기본타입형과는 그 과정을 생략할 수 있다.
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));		
		System.out.println(Objects.deepEquals(o1, o2) + "\n");
		
		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		//deepEquals로 비교하면 두 배열객체의 항목이 같으므로 true
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}
}
