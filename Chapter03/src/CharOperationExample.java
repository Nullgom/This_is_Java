// char 타입 연산
// char 타입이 산술 연산이 될 경우 int 타입으로 변환되므로 산출 타입은 int 타입이다.
public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; // 컴파일 에러
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		// System.out.println("c3: " + c3);
	}
}
