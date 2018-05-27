package sec03.exam02_field_method_access;
// 멤버 클래스에서 사용 제한
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	/** 인스턴스 멤버 클래스 **/
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	/** 스태틱 맴버 클래스 **/
	static class C {
		void method() {
			// field1 = 10;  // 인스턴스 필드와 메소드는 접근할 수 없다.
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
