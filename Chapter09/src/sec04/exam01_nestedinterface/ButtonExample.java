package sec04.exam01_nestedinterface;
// ��ư �̺�Ʈ ó��
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		// �͸� ��ü ó��
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
			}
		});
		btn.touch();
	}

}
