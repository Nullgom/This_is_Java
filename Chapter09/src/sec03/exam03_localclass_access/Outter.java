package sec03.exam03_localclass_access;
// ���� Ŭ�������� ��� ����
public class Outter {
	/** �ڹ� 7 ���� **/
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; (x)
		// localVariable = 100; (x)
		class Inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	/** �ڹ� 8 ���� **/
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		class Inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
