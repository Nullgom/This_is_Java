// �ΰ��� �ֻ��� ������ �� ������ ���� (x , y)���, �� ���� ���� 5�̸� ������ ����.
public class Exercise04 {
	public static void main(String[] args) {
		int count = 1, x = 0, y = 0;
		while( (x + y) != 5) {
			x = (int)(Math.random() * 6) + 1;
			y = (int)(Math.random() * 6) + 1;
			System.out.printf("%2dȸ - (%d, %d)\n", count, x, y);
			count++;
		}
	}
}