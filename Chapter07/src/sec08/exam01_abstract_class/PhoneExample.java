package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); // Phone은 추상클래스라 new 연산자를 사용하지 못함.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();  // Phone 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
//		Phone phone = new SmartPhone("강감찬");
//		phone.turnOn();
//		phone.turnOff();
		
	}

}
