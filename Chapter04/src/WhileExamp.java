import java.util.Scanner;

// while �� ����
public class WhileExamp {
	public static void main(String[] args) {
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		int sel = 0;
		
		while(!flag) {
			System.out.println("------- Menu -------");
			System.out.println("| 1. 2. 3. 99.exit |");
			System.out.print("Select Number : ");
			sel = scan.nextInt();
			
			// if(sel == 99) flag = true;
			switch(sel) {
				case 1: // �� ���ϱ�
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					System.out.println("1���� 10���� ��: " + sum);
					break;
				case 2: // 1~6 �߿� �ϳ��� �� ���
					int outNum = (int) (Math.random() * 6) + 1;
					System.out.println("1~6 �� ���� ��� �� --> " + outNum);
					break;
				case 3: // ������ 3�� ���
					System.out.println("### ������ 3�� ###");
					for(int i = 1; i <= 9; i++)
						System.out.printf("  %2d x %2d = %2d\n", sel, i, (sel*i));
					break;
				case 99: 
					flag = true;
					break;
				default :
					System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�." );
			}
		}
		System.out.println("���α׷� ����");
	}
}
