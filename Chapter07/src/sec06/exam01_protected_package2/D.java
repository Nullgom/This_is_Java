package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;
// 다른 패키지에서 상속된 클래스의 protected가 있는 생성자, 필드, 메소드 호출
public class D extends A {
	public D()  {
		super();
		this.field = "value"; // 자식은 부모 클래스의 protected 접근 제한자에 접근할 수 있다.
		this.method();
	}
	
	public void method() {
		this.field = "value";
		this.method();
	}
}
