package ezen0801_Inheritance.sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
 
	public abstract void sound(); // 동물의 울음소리는 동물마다 다르기때문에 추상메소드로 구현.
}

