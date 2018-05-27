package sec08.exam02_abstract_method;

public abstract class Animal { // 추상 클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 선언
	public abstract void sound();  // 실행 내용 {}은 없고 선언부만 있음.
}
