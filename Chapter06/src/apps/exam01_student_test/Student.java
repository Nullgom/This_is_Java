package apps.exam01_student_test;

public class Student {
	// 필드
	int id; // 학생 번호
	String name; // 이름
	int subNum; // 과목수
	Test[] test; 
	
	// 생성자
	public Student(int i, String n, int s) {
		id = i;
		name = n;
		subNum = s;
		test = new Test[s];
		for(int j = 0; j < s; j++) {
			test[j] = new Test();
		}
	}
		
	// 메소드
	// 이름을 가져오는 메소드
	String getName() { 
		return id + ":" + name;
	}
	// 총점을 가져오는 메소드
	int getGrade() {
		int sum = 0;
		for(int i = 0; i < subNum; i++)
			sum += test[i].point;
		return sum;
	}
	// 메소드 오버로딩
	// 성적을 평가하는 메소드
	int getGrade(int a) {
		int base = 100 * subNum / a;
		int rank = getGrade() / base + 1;
		return rank;
	}
	
	// 성적을 표시하는 메소드
	void printScore() {
		System.out.println(getName());
		for(int i=0; i< subNum; i++)
			System.out.print(test[i].getPoint() + " ");
		System.out.println();
		System.out.println("총점 " + getGrade());
		int rank = 5;
		System.out.println(rank + "단계 평가 " + getGrade(rank));
		System.out.println();
	}
}
