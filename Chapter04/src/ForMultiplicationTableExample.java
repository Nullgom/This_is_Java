import java.util.Scanner;
/**
 * ������ ����ϱ�
 * 
 */
public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		int m = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		while(!flag) {
			System.out.print("����ϱ� ���ϴ� ���� �Է��Ͻÿ�(0.exit): ");
			m = sc.nextInt();
			if( m == 0) {
				flag = true;
				continue;
			}
			System.out.println("**** ������ " + m + "�� ****");
			for(int i = 2; i <= 9; i++ ) {
				System.out.printf( "%2d x %2d  = %2d\n",  m,  i,  (m * i));
			}
			System.out.println("-----------------------------");
		}
		sc.close();
		System.out.println("���α׷� ����");
	}
}
