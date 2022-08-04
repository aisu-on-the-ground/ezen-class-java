package ezen0804_Nested.sec04.exam01_nestedinterface;

public class Button {
	
	interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	// 선언만 해준 상태. 실체로 구현되지는 X.
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
}
