package sec04.exam02_super;
// 부모 메소드 호출(super) 사용 예
public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println("초음속 비행 모드로 변경합니다.");
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		System.out.println("일반 비행 모드로 변경합니다.");
		sa.fly();
		sa.land();
	}
}
