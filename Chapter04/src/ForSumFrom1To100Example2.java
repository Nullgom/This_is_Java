//1 ���� 10���� ����ϱ�
public class ForSumFrom1To100Example2 {
	
	public static void main(String[] args) {
		int sum = 0; // �հ� ����
		int endNum = 100;
		
		int i = 0;
		for(i = 1; i <= endNum; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + (i-1) + "���� ��: " + sum);
	}
}
