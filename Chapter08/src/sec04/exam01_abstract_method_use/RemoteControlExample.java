package sec04.exam01_abstract_method_use;
// �������̽� ������ ���� ��ü ����
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; // �������̽� ���� ����
		 
		rc = new Television(); // Television ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		
		rc = new Audio(); // Audio ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(true);
		rc.turnOff();
	}
}
