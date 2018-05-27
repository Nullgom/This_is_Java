package sec04.exam01_overriding;
// 부모 클래스
public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.141592 * r * r;
	}
}
