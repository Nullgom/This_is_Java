package sec02.exam01_nestedclass_object;
// 중첩 클래스 예제
public class A {
	A() {
		System.out.println("A 객체가 생성됨");
		
		// A class 내에서 B 객체 접근.
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
	
	/** 인스턴스 멤버 클래스 **/
	class B {
		// 필드
		int field1;
		// static int field2; // (X) 컴파일 오류 - static 필드 생성할 수 없음
		
		// 생성자
		B() { System.out.println("B 객체가 생성됨"); }
		// 메소드
		void method1() { System.out.println("B 객체의 method1() 호출"); }
		// static void method2() { } // (X) 컴파일 오류 - static 메소드는 생성할 수 없음
	}
	
	/** 정적 멤버 클래스 **/
	static class C {
		int field1;
		static int field2;
		// 생성자
		C() { System.out.println("C 객체가 생성됨"); }
		// 메소드
		void method1() { System.out.println("C 객체의 method1() 호출"); }
		static void method2() { System.out.println("C 객체의 method2() 호출"); } 
	}
	
	void method() {
		/** 로컬 클래스 **/
		class D {
			int field1;
			// static int field2;
			D() { System.out.println("D 객체가 생성됨"); }
			void method1() { System.out.println("D 객체의 method1() 호출"); }
			// static void method2() { }
		}
		// 로컬클래스 사용 방법.
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
