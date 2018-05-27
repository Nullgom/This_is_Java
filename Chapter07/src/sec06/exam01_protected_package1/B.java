package sec06.exam01_protected_package1;
// protected 접근 제한자 테스트
// 같은 패키지 내에서 protected가 있는  생성자, 필드, 메소드 호출함 
public class B {
	public void method() {
		A a = new A();
		a.field = "value"; 
		a.method();
	}
}
