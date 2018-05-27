package sec03.exam02_anonymous_implement_class;

// �͸� ���� Ŭ���� �ۼ��ϱ�
import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		String rcName = "Radio";
		RemoteControl rc = new RemoteControl() { // �͸� ���� ��ü
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println(rcName + "�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println(rcName + "�� ���ϴ�.");
				otherMethod(); // �͸� Ŭ�������� �߰��� �޼ҵ�� �͸� Ŭ������������ ����� �����ϴ�.
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
				System.out.println("���� " + rcName + " ����: " + this.volume);
			}
			
			private void otherMethod() {
				System.out.println("otherMethod() ȣ��");
			}
		};
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}
}
