package sec03.exam01_parent_constructor_call;

// �ڽ� Ŭ����
public class Student extends People {
	public int studentNo;
	
	public Student() {
		super("ȫ�浿", "123456-1234567");
		studentNo = 1;
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		System.out.println("�ڽ� ��ü ���� �Ϸ�");
	}
}
