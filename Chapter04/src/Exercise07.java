import java.util.Scanner;

// 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드
public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0; // 메뉴 선택 변수
		int balance = 0; // 예금액
		int deposit, withdraw; // 입금, 출금
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------MENU----------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("현재 예금액: " + balance + "원");
			System.out.println("-----------------------------------");
			System.out.print("선택 >>");
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				deposit = 0;
				System.out.println("-----------------------------------");
				System.out.println("예금할 금액을 입력하세요.");
				System.out.print("금액 > ");
				deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 2: 
				withdraw = 0;
				System.out.println("-----------------------------------");
				System.out.println("출금할 금액을 입력하세요.");
				System.out.print("금액 > ");
				withdraw = scanner.nextInt();
				if(balance < withdraw) {
					System.out.println("현재 예금액 보다 출금할 금액이 큽니다.");
					continue;
				}
				balance -= withdraw;
				break;
			case 3: 
				System.out.println("-----------------------------------");
				System.out.println("현재 예금액은 " + balance + "원 입니다.");
				break;
			case 4: 
				run = false; 
				break;
			default: 
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
