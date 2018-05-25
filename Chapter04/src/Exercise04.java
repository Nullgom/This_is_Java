// 두개의 주사위 던졌을 때 나오는 눈을 (x , y)출력, 두 수의 합이 5이면 실행을 멈춤.
public class Exercise04 {
	public static void main(String[] args) {
		int count = 1, x = 0, y = 0;
		while( (x + y) != 5) {
			x = (int)(Math.random() * 6) + 1;
			y = (int)(Math.random() * 6) + 1;
			System.out.printf("%2d회 - (%d, %d)\n", count, x, y);
			count++;
		}
	}
}