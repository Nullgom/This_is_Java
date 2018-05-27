package sec07.exam01_constructor_declaration;

public class CarExample {
	public static void main(String[] args) {
		// Car myCar = new Car(); // (X)  기본 생성자를 호출할 수 없다.
		Car myCar = new Car("검정", 3000);
	}
}
