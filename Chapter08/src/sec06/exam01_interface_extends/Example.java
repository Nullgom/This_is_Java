package sec06.exam01_interface_extends;
// ȣ�� ��� �޼ҵ�
public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // InterfaceA ������ methodA()�� ���� �� �� ����
		System.out.println("------------");
		InterfaceB ib = impl;
		ib.methodB(); // InterfaceB ������ methodB()�� ���� �� �� ����
		System.out.println("------------");
		InterfaceC ic = impl;
		ic.methodA(); 
		ic.methodB();
		ic.methodC(); // InterfaceC ������ methodA(), methodB(), methodC() ��� ȣ�� ����
	}

}
