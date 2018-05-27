package sec07.exam02_promotion_access;
// 자식 클래스
public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("자식 클래스의 method2() 호출됨");
	}
	
	public void method3() {
		System.out.println("자식 클래스의 method3() 호출됨");
	}
}
