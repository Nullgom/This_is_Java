package sec08.exam04_method_overloading;

// 메소드 오버로딩
public class CalculatorExample2 {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}
}
