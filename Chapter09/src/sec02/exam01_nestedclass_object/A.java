package sec02.exam01_nestedclass_object;
// ��ø Ŭ���� ����
public class A {
	A() {
		System.out.println("A ��ü�� ������");
		
		// A class ������ B ��ü ����.
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
	
	/** �ν��Ͻ� ��� Ŭ���� **/
	class B {
		// �ʵ�
		int field1;
		// static int field2; // (X) ������ ���� - static �ʵ� ������ �� ����
		
		// ������
		B() { System.out.println("B ��ü�� ������"); }
		// �޼ҵ�
		void method1() { System.out.println("B ��ü�� method1() ȣ��"); }
		// static void method2() { } // (X) ������ ���� - static �޼ҵ�� ������ �� ����
	}
	
	/** ���� ��� Ŭ���� **/
	static class C {
		int field1;
		static int field2;
		// ������
		C() { System.out.println("C ��ü�� ������"); }
		// �޼ҵ�
		void method1() { System.out.println("C ��ü�� method1() ȣ��"); }
		static void method2() { System.out.println("C ��ü�� method2() ȣ��"); } 
	}
	
	void method() {
		/** ���� Ŭ���� **/
		class D {
			int field1;
			// static int field2;
			D() { System.out.println("D ��ü�� ������"); }
			void method1() { System.out.println("D ��ü�� method1() ȣ��"); }
			// static void method2() { }
		}
		// ����Ŭ���� ��� ���.
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
