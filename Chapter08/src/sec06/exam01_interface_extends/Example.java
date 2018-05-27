package sec06.exam01_interface_extends;
// 호출 기능 메소드
public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // InterfaceA 변수는 methodA()만 실행 할 수 있음
		System.out.println("------------");
		InterfaceB ib = impl;
		ib.methodB(); // InterfaceB 변수는 methodB()만 실행 할 수 있음
		System.out.println("------------");
		InterfaceC ic = impl;
		ic.methodA(); 
		ic.methodB();
		ic.methodC(); // InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
	}

}
