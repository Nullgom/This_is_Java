package sec03.exam01_name_implement_class;
// �������̽� ������ ���� ��ü ����
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(true);
		rc.turnOff();
	}
}
