import java.util.Scanner;
/**
 * 구구단 출력하기
 * 
 */
public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		int m = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		while(!flag) {
			System.out.print("출력하기 원하는 단을 입력하시오(0.exit): ");
			m = sc.nextInt();
			if( m == 0) {
				flag = true;
				continue;
			}
			System.out.println("**** 구구단 " + m + "단 ****");
			for(int i = 2; i <= 9; i++ ) {
				System.out.printf( "%2d x %2d  = %2d\n",  m,  i,  (m * i));
			}
			System.out.println("-----------------------------");
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
