package sec04.exam02_default_method_use;
// �������̽��� ����Ʈ �޼ҵ� ���
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; // �������̽� ���� ����
		 
		rc = new Television(); // Television ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.turnOff();
		System.out.println("------------");
		rc = new Audio(); // Audio ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(true);
		rc.turnOff();
	}
}
