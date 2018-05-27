package sec07.exam04_array_management;
// Tire의 자식 클래스
public class KoomhoTire extends Tire {
	// 생성자
	public KoomhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;  // 누적 회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KoomhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("**** " + location + " KoomhoTire 펑크 ****");
			return false;
		}
	}
}
