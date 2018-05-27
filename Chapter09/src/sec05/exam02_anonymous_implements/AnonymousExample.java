package sec05.exam02_anonymous_implements;

// 익명 구현 클래스 실행 
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		System.out.println("--------------");
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		System.out.println("--------------");
		
		// 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			private void searchWeb() {
				System.out.println("인터넷을 검색합니다.");
			}
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
				searchWeb();
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");			
			}
		});
	}
}
