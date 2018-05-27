package sec03.exam01_parent_constructor_call;

// 자식 클래스
public class Student extends People {
	public int studentNo;
	
	public Student() {
		super("홍길동", "123456-1234567");
		studentNo = 1;
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
