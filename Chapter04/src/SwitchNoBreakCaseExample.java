// break ���� ���� case
public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8; // 8~11 ������ ���� �̱�
		System.out.println("[����ð�: " + time + "��]");
		
		switch(time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ���մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		defaut:
			System.out.println("�ܱ��� �����ϴ�.");
		}
	}
}
