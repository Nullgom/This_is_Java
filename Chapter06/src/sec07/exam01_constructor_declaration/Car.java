package sec07.exam01_constructor_declaration;

// 생성자 선언
public class Car {
	// 필드
	String color;
	int cc;
	
	// 생성자
	Car(String color, int cc) { 
		// 객체의 초기화 코드
		this.color = color;
		this.cc = cc;
	} // 개발자가 선언한 생성자가 있을 경우, 컴파일러는 기본 생성자를 추가하지 않는다.
}
