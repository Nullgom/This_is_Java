package sec03.exam01_name_implement_class;
// 인터페이스 변수에 구현 객체 대입
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
