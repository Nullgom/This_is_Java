// Ű����� while �� ����
public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 12 && keyCode != 10) { // Enter Ű�� �ԷµǸ� ĳ��������(13), �����ǵ�(10)�� �ԷµǹǷ� �� ���� ����
				System.out.println("\n-------------------------------");
				System.out.println(" 1.���� | 2.���� | 3.����"); // �޴� ����
				System.out.println("-------------------------------");
				System.out.print("����: ");
			}
			keyCode = System.in.read(); // Ű������ Ű �ڵ带 ����
			
			if(keyCode == 49) { // 1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			}  else if(keyCode == 50) { // 2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if(keyCode == 51) { // 3�� �о��� ���
				run = false; //  while ���� �����ϱ� ���� run ������ false�� ����
			}
		}
		System.out.println("���α׷� ����");
	}
}
