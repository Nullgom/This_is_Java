package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); // Phone�� �߻�Ŭ������ new �����ڸ� ������� ����.
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		smartPhone.turnOn();  // Phone �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
//		Phone phone = new SmartPhone("������");
//		phone.turnOn();
//		phone.turnOff();
		
	}

}
