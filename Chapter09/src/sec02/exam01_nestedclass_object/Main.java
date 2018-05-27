package sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		System.out.println("------------");
		A.C c = new A.C();
		c.field1 = 3; // 인스턴스 필드 사용
		c.method1(); // 인스턴스 메소드 사용.
		A.C.field2 = 3; // 정적 필드 사용.
		A.C.method2();  // 정적 메소드 호출
		
		System.out.println("------------");
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
