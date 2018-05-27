package apps.exam01_student_test;

public class Classroom {

	public static void main(String[] args) {
		Student kim = new Student(12, "김주선", 3);
		kim.test[0].setPoint("국어", 95);
		kim.test[1].setPoint("영어", 83);
		kim.test[2].setPoint("수학", 76);
		kim.printScore();
		
		Student lee = new Student(7, "이진주", 3);
		lee.test[0].setPoint("국어", 66);
		lee.test[1].setPoint("영어", 97);
		lee.test[2].setPoint("수학", 72);
		lee.printScore();
	}

}
