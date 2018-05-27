package sec04.exam01_nestedinterface;

public class Button {
	OnClickListener listener; // 인터페이스 타입 필드
	
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
