// break 문이 없는 case
public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8; // 8~11 사이의 정수 뽑기
		System.out.println("[현재시간: " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		defaut:
			System.out.println("외근을 나갑니다.");
		}
	}
}
