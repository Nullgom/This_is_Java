package sec07.exam04_array_management;
// Tire�� �ڽ� Ŭ����
public class KoomhoTire extends Tire {
	// ������
	public KoomhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;  // ���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KoomhoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("**** " + location + " KoomhoTire ��ũ ****");
			return false;
		}
	}
}
