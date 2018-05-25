import java.util.Scanner;
// 시작값과 종료값을 입력받아 출력하기
public class ForExample {
	public static void main(String[] args) {
		int startNum, endNum;
		Scanner scan = new Scanner(System.in);
		
		while(true) { // == for(;;) 
			System.out.print("시작 값을 입력하세요 :");
			startNum = scan.nextInt();
			
			System.out.print("종료 값을 입력하세요 :");
			endNum = scan.nextInt();
			
			if (startNum <= endNum)
				break;
			else 
				System.out.println("시작 값이 종료 값보다 큽니다. 다시 입력 바랍니다.");
		}
		/*
		do {
			System.out.print("시작 값을 입력하세요 :");
			startNum = scan.nextInt();
			
			System.out.print("종료 값을 입력하세요 :");
			endNum = scan.nextInt();
			
			if(startNum > endNum) 
				System.out.println("시작 값이 종료 값보다 큽니다. 다시 입력 바랍니다.");
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
