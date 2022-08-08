package ezen0804_Nested.sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() { // 익명 구현 객체
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	/*
	public void onClick() {	System.out.println("전화를 겁니다."); }
	라는 내용을 가친 익명의 객체를 만든다. (그 객체는 OnclickListener를 구현한 객체이다.)
	
	만약 객체가 OO라는 이름을 가졌다고 한다면, 
	OnClickListener listener = new OO; 와 같은 형태이며
	new 뒤에 클래스 이름이 나와야 하지만 실제로는 아무 클래스도 존재하지 않으므로
	인터페이스 이름을 대신 적어주고 블럭{} 안에는 추상메소드를 오버라이드하여 실체화 하는 과정이
	같이 수반되어야 한다.
	*/
	Window() { // 생성자
		button1.setOnClickListener(listener);
		
		//매개값으로 대입
		button2.setOnClickListener(new Button.OnClickListener() { // 익명 구현 객체
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
