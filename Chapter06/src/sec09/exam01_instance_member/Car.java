package sec09.exam01_instance_member;

// �ν��Ͻ� ����� this
public class Car {
	// �ʵ�
	String model;
	int speed;
	
	// ������
	Car(String model) {
		this.model = model;
	}
	
	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
		
	void run() {
		for(int i = 10; i <= 50; i+=10) {			
			this.setSpeed(i); 
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}
}
