package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); (X) // Vehicle �������̽����� checkFare()�� �����ϴ�.
		
		Bus bus = (Bus) vehicle; // ���� Ÿ�� ��ȯ
		bus.run();
		bus.checkFare(); // Bus Ŭ������ checkFare()�� ����.
	}
}
