import java.util.Scanner;

// while 문 예제
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
				case 1: // 합 구하기
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					System.out.println("1부터 10까지 합: " + sum);
					break;
				case 2: // 1~6 중에 하나의 값 출력
					int outNum = (int) (Math.random() * 6) + 1;
					System.out.println("1~6 중 랜덤 출력 값 --> " + outNum);
					break;
				case 3: // 구구단 3단 출력
					System.out.println("### 구구단 3단 ###");
					for(int i = 1; i <= 9; i++)
						System.out.printf("  %2d x %2d = %2d\n", sel, i, (sel*i));
					break;
				case 99: 
					flag = true;
					break;
				default :
					System.out.println("잘못된 메뉴를 선택하셨습니다." );
			}
		}
		System.out.println("프로그램 종료");
	}
}
