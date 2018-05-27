package sec07.exam01_why_default_method;
// 기존 인터페이스
public interface MyInterface {
	public void method1();
	
	// 디폴트 메소드
	public default void method2() {
		System.out.println("MyInterface-method2() 실행");
	}
}
