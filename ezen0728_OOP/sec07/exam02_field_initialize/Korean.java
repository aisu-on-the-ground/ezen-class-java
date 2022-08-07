package ezen0728_OOP.sec07.exam02_field_initialize;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자
	public Korean(String n) {
	  name = n;
	}
	
	public Korean(String name, String ssn) {
	  this.name = name;
	  this.ssn = ssn;
	}
}

