package apps.exam01_student_test;

public class Student {
	// �ʵ�
	int id; // �л� ��ȣ
	String name; // �̸�
	int subNum; // �����
	Test[] test; 
	
	// ������
	public Student(int i, String n, int s) {
		id = i;
		name = n;
		subNum = s;
		test = new Test[s];
		for(int j = 0; j < s; j++) {
			test[j] = new Test();
		}
	}
		
	// �޼ҵ�
	// �̸��� �������� �޼ҵ�
	String getName() { 
		return id + ":" + name;
	}
	// ������ �������� �޼ҵ�
	int getGrade() {
		int sum = 0;
		for(int i = 0; i < subNum; i++)
			sum += test[i].point;
		return sum;
	}
	// �޼ҵ� �����ε�
	// ������ ���ϴ� �޼ҵ�
	int getGrade(int a) {
		int base = 100 * subNum / a;
		int rank = getGrade() / base + 1;
		return rank;
	}
	
	// ������ ǥ���ϴ� �޼ҵ�
	void printScore() {
		System.out.println(getName());
		for(int i=0; i< subNum; i++)
			System.out.print(test[i].getPoint() + " ");
		System.out.println();
		System.out.println("���� " + getGrade());
		int rank = 5;
		System.out.println(rank + "�ܰ� �� " + getGrade(rank));
		System.out.println();
	}
}
