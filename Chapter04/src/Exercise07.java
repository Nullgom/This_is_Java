import java.util.Scanner;

// �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ�
public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0; // �޴� ���� ����
		int balance = 0; // ���ݾ�
		int deposit, withdraw; // �Ա�, ���
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------MENU----------------");
			System.out.println(" 1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("���� ���ݾ�: " + balance + "��");
			System.out.println("-----------------------------------");
			System.out.print("���� >>");
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				deposit = 0;
				System.out.println("-----------------------------------");
				System.out.println("������ �ݾ��� �Է��ϼ���.");
				System.out.print("�ݾ� > ");
				deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 2: 
				withdraw = 0;
				System.out.println("-----------------------------------");
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				System.out.print("�ݾ� > ");
				withdraw = scanner.nextInt();
				if(balance < withdraw) {
					System.out.println("���� ���ݾ� ���� ����� �ݾ��� Ů�ϴ�.");
					continue;
				}
				balance -= withdraw;
				break;
			case 3: 
				System.out.println("-----------------------------------");
				System.out.println("���� ���ݾ��� " + balance + "�� �Դϴ�.");
				break;
			case 4: 
				run = false; 
				break;
			default: 
				System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�.");
				break;
			}
			
		}
		System.out.println("���α׷� ����");
	}
}
