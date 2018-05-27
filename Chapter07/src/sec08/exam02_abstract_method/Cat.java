package sec08.exam02_abstract_method;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	// 추상 메소드 오버라이딩.
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
}
