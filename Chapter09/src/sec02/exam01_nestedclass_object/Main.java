package sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		System.out.println("------------");
		A.C c = new A.C();
		c.field1 = 3; // �ν��Ͻ� �ʵ� ���
		c.method1(); // �ν��Ͻ� �޼ҵ� ���.
		A.C.field2 = 3; // ���� �ʵ� ���.
		A.C.method2();  // ���� �޼ҵ� ȣ��
		
		System.out.println("------------");
		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
