import java.util.Scanner;

public class ScoreSwitchExample {
	public static void main(String[] args) {
		int score = 0, result;
		String grade;
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		
		while (!check) {
			System.out.print("������ �Է��Ͻÿ�: ");
			score = sc.nextInt();
			if(score > 100 || score < 0) {
				System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
				check = false;
				continue;
			}
			check = true;
		}
		sc.close();
		result = score / 10;
		//ToDo: ���� �˻�
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
		System.out.println("������ " + grade + "�Դϴ�.");
	}
}
