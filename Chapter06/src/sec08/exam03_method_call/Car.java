package sec08.exam03_method_call;

// 클래스 외부에서 메소드 호출
public class Car {
	// 필드
	int speed;
	
	// 생성자
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			// speed = i;
			setSpeed(i); 
			System.out.println("달립니다.(시속:" + speed + "km/h");
		}
	}
}
