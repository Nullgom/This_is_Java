import java.util.Scanner;
// ���۰��� ���ᰪ�� �Է¹޾� ����ϱ�
public class ForExample2 {
	public static void main(String[] args) {
		int startNum, endNum; // ���۰�, ���ᰪ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϼ��� :");
		startNum = scan.nextInt();
			
		System.out.print("���� ���� �Է��ϼ��� :");
		endNum = scan.nextInt();
	
		// startNum �� ũ�� �� ���� �����Ѵ�.
		int k = 1;
		if (startNum > endNum) {
//			int temp = 0;
//			temp = startNum;
//			startNum = endNum;
//			endNum = temp;
			for (int i = endNum; i <= startNum; i++) {
				System.out.print(i + " ");
				if(k % 5 == 0) {
					System.out.println("");
				}
				k++;
			}
		} else  {			
			for (int i = startNum; i <= endNum; i++) {
				System.out.print(i + " ");
				if(k % 5 == 0) {
					System.out.println("");
				}
				k++;
			}
		}
		
		scan.close();
		
		
		System.out.println("END");
	}
}
