package sec06.exam01_interface_extends;
// 하위 인터페이스 메소드 구현 클래스
public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");		
	} 

}
