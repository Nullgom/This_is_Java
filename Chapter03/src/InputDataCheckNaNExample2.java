// "NaN" 을 체크하고 연산 수행
public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";  // 사용자로부터 입력받은 값
		double val = Double.valueOf(userInput); // 입력값을 double 타입으로 변환
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { // NaN을 검사함
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		currentBalance += val; // currentBalance의 원래 값이 유지됨
		System.out.println(currentBalance);
	}
}
