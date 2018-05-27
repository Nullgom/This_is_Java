package sec10.exam01_static_member;

// 정적 멤버 사용
public class Calculator {
	static double pi = 3.141592;
	
	//정적 메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
