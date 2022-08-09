package ezen0801_Inheritance.verify.exam05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.name = name; //이 예제에서는 부모클래스의 생성자 정의도
						  //this.name = name; 이므로 생략 가능.
		this.studentNo = studentNo;
	}


	public int getStudentNo() {
		return studentNo;
	}
	
	
}
