// for ���� �̿��� 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����� ������.
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
