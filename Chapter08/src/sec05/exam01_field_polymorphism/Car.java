package sec05.exam01_field_polymorphism;

public class Car {
	// �������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü Ÿ��
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { // �������̽����� ����� roll() �޼ҵ� ȣ��
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
