package sec08.exam04_method_overloading;

// �޼ҵ� �����ε�
public class CalculatorExample2 {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);
		
		// ���簢���� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 20);
		
		// ��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
	}
}
