package sec07.exam03_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HonkookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른 KoomhoTire로 교체");
				car.frontRightTire = new KoomhoTire("앞왼쪽", 13);
				break;
			case 3:
				System.out.println("앞왼쪽 HonkookTire로 교체");
				car.backLeftTire = new HankookTire("앞왼쪽", 14);
				break;
			case 4:
				System.out.println("앞왼쪽 KoomhoTire로 교체");
				car.backRightTire = new KoomhoTire("앞왼쪽", 17);
				break;
			default:
				break;
			}
			System.out.println("----------------------------------"); // 1회전 시 출력되는 내용 구분
			
		}
	}
}
