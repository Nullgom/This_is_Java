// ��ǥ�� �ﰢ�� ���
public class Exercise06 {
	public static void main(String[] args) {
		
		System.out.println("----- �ﰢ�� -----");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// �� �ﰢ��
		System.out.println("\n----- ���ﰢ�� -----");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
