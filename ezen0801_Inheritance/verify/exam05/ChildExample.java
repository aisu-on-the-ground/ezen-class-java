package ezen0801_Inheritance.verify.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Child ch = new Child("홍길동", 123);
		System.out.println(ch.name);
		//System.out.println(ch.studentNo);
		//에러. studentNo는 private 제한자를 갖고 있으므로 getter&setter 메소드로 접근해야 함.
		// ex) System.out.println(ch.getStudentNo());
		
		System.out.println(ch.getStudentNo());
		
	}

}
