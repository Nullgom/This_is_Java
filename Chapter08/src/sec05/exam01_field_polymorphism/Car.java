package sec05.exam01_field_polymorphism;

public class Car {
	// 인터페이스 타입 필드 선언과 초기 구현 객체 타입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { // 인터페이스에서 설명된 roll() 메소드 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
