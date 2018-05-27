package sec07.exam02_default_method_extends;

// 자식 인터페이스
public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2(); // 추상 메소드로 재선언
	
	public void method3();
	
}
