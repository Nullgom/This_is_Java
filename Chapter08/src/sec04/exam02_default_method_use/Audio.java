package sec04.exam02_default_method_use;
// �������̽� ���� Ŭ����
public class Audio implements RemoteControl {
	// �ʵ�
	private int volume;
	private boolean mute;
	
	// �߻� �޼ҵ��� ��ü �޼ҵ� ����
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + this.volume);
	}
	
	// ����Ʈ �޼ҵ� ������
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
}
