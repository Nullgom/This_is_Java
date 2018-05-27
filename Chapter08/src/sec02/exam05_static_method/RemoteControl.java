package sec02.exam05_static_method;

public interface RemoteControl {
	// ���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�(Java 8 ���� �߰���.)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// ���� �޼ҵ�(Java 8 ���� �߰���.)
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
