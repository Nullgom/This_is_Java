package sec07.exam07_instanceof;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) { // Child Ÿ������ ��ȯ�� �������� Ȯ��
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
			child.method3(); // ��ȯ �� �ڽ� Ŭ�������� �ִ� �޼ҵ带 ����� �� �ִ�.
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; // ClassCastException�� �߻��� ���ɼ��� ����.
		System.out.println("method1 - Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child(); 
		method1(parentA); // Child ��ü�� �Ű������� ����
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB); // Parent ��ü�� �Ű������� ����.
		method2(parentB);
	}

}
