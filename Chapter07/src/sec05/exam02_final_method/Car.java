package sec05.exam02_final_method;
// �������� �� ���� final �޼ҵ�
public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
