package sec07.exam04_other_constructor_call;

// Return 문
public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() { }
	
	Car(String model) {
//		this.model = model;
//		this.color = null;
//		this.maxSpeed = 0;
		this(model, null, 0);
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 0;
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		// 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
