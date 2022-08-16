package ezen0816_Collection.sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3); //배열을 List로... -> Arrays 클래스 다시 공부
		// 자동박싱 int -< Integer
		// 정석은 Arrays.asList(new Integer(1), new Integer(2), new Integer(3));
		for(int value : list2) { // 자동언박싱 Integer -> int
			System.out.println(value);
		}
	}
}
