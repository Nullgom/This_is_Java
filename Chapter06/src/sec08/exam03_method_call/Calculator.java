package sec08.exam03_method_call;

// Ŭ���� ���ο��� �޼ҵ� ȣ��
public class Calculator {
	// �޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // plus() �޼ҵ� ȣ��
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("������: " + result); // println() �޼ҵ� ȣ��
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
