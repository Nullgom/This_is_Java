package apps.exam01_student_test;

public class Test {
	String subject; // �ʵ� ������
	int point;  // �ʵ� ����
	
	// ������ �����ϴ� �޼ҵ�
	void setPoint(String s, int p) { 
		subject = s;
		point = p;
	}
	
	// �� ������ ������ �������� �޼ҵ�
	String getPoint() {
		return subject + ":" + point;
	}
}
