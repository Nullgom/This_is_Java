package sec05.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 오버라이딩을 할 수 없음
//	public void stop() { // 컴파일 에러 발생
//		System.out.println("스포트카를 멈춤");
//		speed = 0;
//	}
}
