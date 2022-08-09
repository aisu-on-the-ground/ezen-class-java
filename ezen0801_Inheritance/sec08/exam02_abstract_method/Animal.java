package ezen0801_Inheritance.sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
 
	public abstract void sound(); // 동물의 울음소리는 동물마다 다르기때문에 추상메소드로 구현.
	//이처럼 메소드가 추상이라면 자식 클래스들에서 이 메소드를 오버라이드하여
	//공통적 특성이 나타나는 부분을 제외한(해당 예제에서는 공통적 특성이 기술되어 있지 않고 비워져 있다.)
	//독립적 특성을 추가하여 메소드를 재정의 한 후 사용하여야 한다.
}

