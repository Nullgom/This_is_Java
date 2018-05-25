import java.util.Scanner;
// 시작값과 종료값을 입력받아 출력하기
public class ForExample2 {
	public static void main(String[] args) {
		int startNum, endNum; // 시작값, 종료값
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 값을 입력하세요 :");
		startNum = scan.nextInt();
			
		System.out.print("종료 값을 입력하세요 :");
		endNum = scan.nextInt();
	
		// startNum 더 크면 두 값을 변경한다.
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
