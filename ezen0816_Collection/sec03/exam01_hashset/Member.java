package ezen0816_Collection.sec03.exam01_hashset;

import java.util.Objects;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
		// return Objects.hash(name, age); 로 사용해줄 수도 있음 (권장)
	}
}
