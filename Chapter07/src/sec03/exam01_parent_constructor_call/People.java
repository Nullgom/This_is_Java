package sec03.exam01_parent_constructor_call;
// 부모 클래스
public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 객체 생성 완료");
	}
}
