package sec07.exam03_field_polymorphism;
// Tire�� �ڽ� Ŭ����
public class HankookTire extends Tire {
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;  // ���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("****" + location + " HankookTire ��ũ ****");
			return false;
		}
	}
}
