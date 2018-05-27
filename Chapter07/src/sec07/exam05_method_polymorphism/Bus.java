package sec07.exam05_method_polymorphism;
// 자식 클래스
public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");		
	}
}
