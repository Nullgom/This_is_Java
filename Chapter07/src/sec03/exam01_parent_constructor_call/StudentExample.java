package sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-12334567", 26);
		
		System.out.println("name : " + student.name ); // �θ𿡼� �������� �ʵ� ���
		System.out.println("ssn : " + student.ssn );   // �θ𿡼� �������� �ʵ� ���
		System.out.println("studentNo : " + student.studentNo); // �ڽ��� �ʵ� ���
	}
}
