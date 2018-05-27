package sec03.exam02_anonymous_implement_class;

// 익명 구현 클래스 작성하기
import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		String rcName = "Radio";
		RemoteControl rc = new RemoteControl() { // 익명 구현 객체
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println(rcName + "를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println(rcName + "를 끕니다.");
				otherMethod(); // 익명 클래스에서 추가된 메소드는 익명 클래스내에서만 사용이 가능하다.
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
				System.out.println("현재 " + rcName + " 볼륨: " + this.volume);
			}
			
			private void otherMethod() {
				System.out.println("otherMethod() 호출");
			}
		};
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}
}
