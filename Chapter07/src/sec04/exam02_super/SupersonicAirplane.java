package sec04.exam02_super;
// �ڽ� Ŭ����
//�θ� �޼ҵ� ȣ��(super) ��� ��
public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			// System.out.println("������ ���� ���� �����մϴ�.");
			System.out.println("������ �����մϴ�.");
		} else  {
			// Airplane ��ü�� fly() �޼ҵ带 ȣ��
			super.fly();
		}
		
	}
}
