package ezen0809_APIs.sec03.exam04_clone;

public class Member implements Cloneable { // clone() 메소드를 호출하기 위함. 앞으로 Member 클래스 내에서는 반드시 clone() 메소드를 호출해야 함. 그렇지 않으면 예외발생.
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id,  String name, String password, int age, boolean adult ) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); // clone() 호출
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
