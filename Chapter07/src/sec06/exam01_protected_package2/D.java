package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;
// �ٸ� ��Ű������ ��ӵ� Ŭ������ protected�� �ִ� ������, �ʵ�, �޼ҵ� ȣ��
public class D extends A {
	public D()  {
		super();
		this.field = "value"; // �ڽ��� �θ� Ŭ������ protected ���� �����ڿ� ������ �� �ִ�.
		this.method();
	}
	
	public void method() {
		this.field = "value";
		this.method();
	}
}
