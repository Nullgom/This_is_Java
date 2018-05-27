package sec04.exam02_super;
// 자식 클래스
//부모 메소드 호출(super) 사용 예
public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			// System.out.println("초음속 비행 모드로 변경합니다.");
			System.out.println("초음속 비행합니다.");
		} else  {
			// Airplane 객체의 fly() 메소드를 호출
			super.fly();
		}
		
	}
}
