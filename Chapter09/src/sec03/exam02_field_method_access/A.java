package sec03.exam02_field_method_access;
// ��� Ŭ�������� ��� ����
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	/** �ν��Ͻ� ��� Ŭ���� **/
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	/** ����ƽ �ɹ� Ŭ���� **/
	static class C {
		void method() {
			// field1 = 10;  // �ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����.
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
