package apps.exam01_student_test;

public class Test {
	String subject; // 필드 교과명
	int point;  // 필드 점수
	
	// 점수를 설정하는 메소드
	void setPoint(String s, int p) { 
		subject = s;
		point = p;
	}
	
	// 한 과목의 점수를 가져오는 메소드
	String getPoint() {
		return subject + ":" + point;
	}
}
