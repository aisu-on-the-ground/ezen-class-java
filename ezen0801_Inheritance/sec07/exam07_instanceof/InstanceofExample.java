package ezen0801_Inheritance.sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //Parent 타입의 매개변수를 받아 출신(객체 생성)이 Child형인지 확인
			Child child = (Child) parent; //출신이 Child형이 맞다면 Childe로 강제형변환.
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA); //A는 Child의 객체 출신이 맞으므로 if문을 통과하여 강제형변환 가능
		method2(parentA); //method2()는 판별과정 없이 객체 출신만 맞다면 마찬가지로 강제형변환 가능
		
		Parent parentB = new Parent();
		method1(parentB); //B는 Parent의 객체 출신이므로
		                  //if문에서 Chlid의 객체 출신이 아님으로 판별되어 else문으로 빠짐. 강제형변환 불가능.
		//method2(parentB); //method2()는 별다른 판별과정이 없으므로 B가 Childe의 객체 출신이 아님에도
		                    //강제형변환을 시도 -> 이는 예외처리 됨.
	}
}
