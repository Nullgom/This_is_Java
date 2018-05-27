package sec05.exam03_button_event;

public class Button {
	// �������̽� Ÿ�� �ʵ�
	OnClickListener listener; 
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	/** ��ø �������̽� **/
	interface OnClickListener {
		void onClick();
	}
}
