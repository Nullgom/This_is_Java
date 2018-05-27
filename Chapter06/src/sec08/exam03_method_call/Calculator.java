package sec08.exam03_method_call;

// 클래스 내부에서 메소드 호출
public class Calculator {
	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // plus() 메소드 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result); // println() 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
