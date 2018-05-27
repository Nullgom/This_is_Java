package sec07.exam01_why_default_method;
// 새로운 구현 클래스
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}

}
