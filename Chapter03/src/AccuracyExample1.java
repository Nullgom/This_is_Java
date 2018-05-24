// 정확하게 계산할 때에는 부동소숫점 타입을 사용하지 않는다.
public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면.");
		System.out.println(result + "조각이 남는다.");
	}
}
