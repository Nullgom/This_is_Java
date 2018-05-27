package sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// �ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");			
		}
	};
	
	// ������
	public Window() {
		button1.setOnClickListener(listener); // �Ű������� �ʵ� ����
		button2.setOnClickListener(new Button.OnClickListener() { 
			// �Ű������� �͸� ���� ��ü ����
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
