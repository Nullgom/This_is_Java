import java.util.Scanner;
// ���۰��� ���ᰪ�� �Է¹޾� ����ϱ�
public class ForExample {
	public static void main(String[] args) {
		int startNum, endNum;
		Scanner scan = new Scanner(System.in);
		
		while(true) { // == for(;;) 
			System.out.print("���� ���� �Է��ϼ��� :");
			startNum = scan.nextInt();
			
			System.out.print("���� ���� �Է��ϼ��� :");
			endNum = scan.nextInt();
			
			if (startNum <= endNum)
				break;
			else 
				System.out.println("���� ���� ���� ������ Ů�ϴ�. �ٽ� �Է� �ٶ��ϴ�.");
		}
		/*
		do {
			System.out.print("���� ���� �Է��ϼ��� :");
			startNum = scan.nextInt();
			
			System.out.print("���� ���� �Է��ϼ��� :");
			endNum = scan.nextInt();
			
			if(startNum > endNum) 
				System.out.println("���� ���� ���� ������ Ů�ϴ�. �ٽ� �Է� �ٶ��ϴ�.");
		} while(startNum > endNum);
		*/
		scan.close();
		
		int k = 1;
		for (int i = startNum; i <= endNum; i++) {
			System.out.print(i + " ");
			if(k % 5 == 0) {
				System.out.println("");
			}
			k++;
		}
		System.out.println("END");
	}
}
