package sec05.exam02_field_array;

public class Car {
	// �������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü Ÿ��
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() { // �������̽����� ����� roll() �޼ҵ� ȣ��
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
