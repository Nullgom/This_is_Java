// "NaN" �� üũ�ϰ� ���� ����
public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";  // ����ڷκ��� �Է¹��� ��
		double val = Double.valueOf(userInput); // �Է°��� double Ÿ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { // NaN�� �˻���
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		currentBalance += val; // currentBalance�� ���� ���� ������
		System.out.println(currentBalance);
	}
}
