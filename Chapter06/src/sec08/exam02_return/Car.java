package sec08.exam02_return;

// return �� ���
public class Car {
	// �ʵ�
	int gas;
	
	// ������
	
	// �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	// ���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false�� 0�� �ƴϸ� true�� ����
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;  // true�� ����
	}
	
	// ���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return ���� �޼ҵ�� ���� ����
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas �ܷ�:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas �ܷ�:" + gas + ")");
				return; // �޼ҵ� ���� ����
			}
		}
	}
}
