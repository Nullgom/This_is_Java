package sec05.exam03_method_polymorphism;
// �Ű� ������ ������ �׽�Ʈ
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // �ڵ� Ÿ�� ��ȯ Vehicle vehicle = bus;
		driver.drive(taxi);
	}
}
