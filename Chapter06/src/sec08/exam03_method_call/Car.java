package sec08.exam03_method_call;

// Ŭ���� �ܺο��� �޼ҵ� ȣ��
public class Car {
	// �ʵ�
	int speed;
	
	// ������
	
	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			// speed = i;
			setSpeed(i); 
			System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h");
		}
	}
}
