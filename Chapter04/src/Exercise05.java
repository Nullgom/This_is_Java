// for 문을 이용한 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해 보세요.
public class Exercise05 {
	public static void main(String[] args) {
		int result = 0;

		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				result = (4 * x) + (5 * y);
				if(result == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
