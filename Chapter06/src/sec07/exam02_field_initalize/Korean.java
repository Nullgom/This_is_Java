package sec07.exam02_field_initalize;

// 생성자에서 필드 초기화
public class Korean {
	// 필드
	String nation = "대한민국";
	String name; // 이름
	String ssn; // 주민번호
	
	// 생성자
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
}
