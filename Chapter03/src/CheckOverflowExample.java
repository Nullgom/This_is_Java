// ��� ���� ���� �����÷ο츦 Ž��
public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) { // ���� ó�� �ڵ�
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) { // ���� �߻� �ڵ�
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else { // right <= 0 �� ���
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�"); // ���� �߻� �ڵ�
			}
		}
		return left + right;
	}
}
