import java.util.Scanner;

// Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�,
// �ְ� ���� �� ��� ������ ���ϴ� ���α׷�
public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
			} else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i=0; i < studentNum; i++) {
					System.out.print("scores["+ i +"] >" );
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores["+ i +"]: " +  scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0, sum = 0;
				double avg = 0.0;
				for(int i=0; i < scores.length; i++) {
					if(max < scores[i]); max = scores[i];
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
