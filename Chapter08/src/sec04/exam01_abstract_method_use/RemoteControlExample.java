package sec04.exam01_abstract_method_use;
// 인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; // 인터페이스 변수 선언
		 
		rc = new Television(); // Television 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		
		rc = new Audio(); // Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(true);
		rc.turnOff();
	}
}
