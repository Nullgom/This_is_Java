package sec09.exam01_instance_member;

// ÀÎ½ºÅÏ½º ¸â¹ö¿Í this
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("Æ÷¸£½¦");
		Car yourCar = new Car("º¥Ã÷");
		
		
		myCar.run();
		yourCar.run();
	}
}
