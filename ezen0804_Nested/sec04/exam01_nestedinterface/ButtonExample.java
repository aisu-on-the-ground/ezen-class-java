package ezen0804_Nested.sec04.exam01_nestedinterface;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();

		
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("일회용 익명개체를 만듭니다.");
			}
		});
		btn.touch();
	}
}
