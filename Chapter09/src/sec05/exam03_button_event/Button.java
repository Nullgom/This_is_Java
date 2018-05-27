package sec05.exam03_button_event;

public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener; 
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	/** 중첩 인터페이스 **/
	interface OnClickListener {
		void onClick();
	}
}
