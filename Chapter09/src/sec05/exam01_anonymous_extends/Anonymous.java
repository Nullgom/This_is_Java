package sec05.exam01_anonymous_extends;
// �͸� �ڽ� ��ü ����
public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		String name = "ȫ�浿";
		String studentNo;
		
		void work() {
			System.out.println(name + "�� ����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println(name + "�� 6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		// ���� ���������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
