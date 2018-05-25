import java.util.Scanner;

public class ScoreSwitchExample {
	public static void main(String[] args) {
		int score = 0, result;
		String grade;
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		
		while (!check) {
			System.out.print("점수를 입력하시오: ");
			score = sc.nextInt();
			if(score > 100 || score < 0) {
				System.out.println("점수를 잘못 입력하였습니다.");
				check = false;
				continue;
			}
			check = true;
		}
		sc.close();
		result = score / 10;
		//ToDo: 범위 검사
		switch(result) {
		case 10:
		case 9:
			grade = "A";
			if((score % 90) >=5 ) {
				grade += "+";
				
			}
			break;
		case 8:
			grade = "B";
			if((score % 80) >=5) {
				grade += "+";
			}
			break;
		case 7:
			grade = "C";
			if((score % 70) >=5) {
				grade += "+";
			}
			break;
		case 6 :
			grade = "D";
			if((score % 60) >=5) {
				grade += "+";
			}
			break;
		default :
			grade = "F";
			break;
		}
		System.out.println("학점은 " + grade + "입니다.");
	}
}
