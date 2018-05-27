package sec04.exam02_default_method_use;
// 인터페이스의 디폴트 메소드 사용
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; // 인터페이스 변수 선언
		 
		rc = new Television(); // Television 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.turnOff();
		System.out.println("------------");
		rc = new Audio(); // Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(true);
		rc.turnOff();
	}
}
