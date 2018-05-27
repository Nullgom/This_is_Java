package sec07.exam02_promotion_access;
// 자동 카입 변환 후에 멤버 접근
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 자동 타입 변환
		
		parent.method1(); 
		parent.method2(); // 재정의된 메소드가 호출됨
		// parent.method3();
		((Child)parent).method3(); // Child로 캐스팅 후 메소드 호출
		child.method3();
	}
}
