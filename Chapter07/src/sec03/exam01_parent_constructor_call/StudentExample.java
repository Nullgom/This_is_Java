package sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-12334567", 26);
		
		System.out.println("name : " + student.name ); // 부모에서 물려받은 필드 출력
		System.out.println("ssn : " + student.ssn );   // 부모에서 물려받은 필드 출력
		System.out.println("studentNo : " + student.studentNo); // 자식의 필드 출력
	}
}
