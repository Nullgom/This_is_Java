package sec04.exam02_super;
// �θ� �޼ҵ� ȣ��(super) ��� ��
public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println("������ ���� ���� �����մϴ�.");
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		System.out.println("�Ϲ� ���� ���� �����մϴ�.");
		sa.fly();
		sa.land();
	}
}
