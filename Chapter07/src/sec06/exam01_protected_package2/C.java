package sec06.exam01_protected_package2;
import sec06.exam01_protected_package1.A;

// 다른 패키지에서 protected가 있는 생성자, 필드, 메소드 출력
public class C {
	public void method() {
		/*		
		A a = new A();      // 컴파일 에러
		a.field = "value";  // 컴파일 에러
		a.method();         // 컴파일 에러
		*/
	}
}
