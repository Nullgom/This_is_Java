package sec05.exam02_anonymous_implements;

// �͸� ���� Ŭ���� ���� 
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();
		anony.field.turnOff();
		System.out.println("--------------");
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		System.out.println("--------------");
		
		// �͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {
			private void searchWeb() {
				System.out.println("���ͳ��� �˻��մϴ�.");
			}
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV�� �մϴ�.");
				searchWeb();
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV�� ���ϴ�.");			
			}
		});
	}
}
