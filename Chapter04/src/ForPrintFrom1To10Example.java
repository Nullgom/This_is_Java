//1 ���� 10���� ����ϱ�
public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum += i;
			//System.out.println(sum);
		}
		System.out.println(sum);
	}
}
