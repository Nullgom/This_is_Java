package sec05.exam02_final_method;
// 재정의할 수 없는 final 메소드
public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
