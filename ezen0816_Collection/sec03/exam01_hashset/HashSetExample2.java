package ezen0816_Collection.sec03.exam01_hashset;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		
		// 내가 시험해본 코드 ㅇㅇ 예제랑 관련 없음
		 
//		set.add(new Member("홍길동", 30));
//		set.add(new Member("홍길동", 30));
		
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println();
		Member m3 = new Member(null, 0);
		Member m4 = new Member(null, 0);
//		System.out.println(m3.hashCode()); // Member 클래스의 hashCode() 오버라이딩 땜에 여기선 에러뜸
//		System.out.println(m4.hashCode());
		System.out.println();
		
//		String이나 Integer객체는 저장된 값에 따라 해시코드가 결정되는 듯 하다
//		즉, 값이 같다면 객체의 해시코드도 같다고 나온다
//		
//		Member 객체는 같은 값을 가지든, null값을 가지든 각 객체는 다른 해시코드를 갖는다
		
		System.out.println("총 객체수 : " + set.size());
	}
}

