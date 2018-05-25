/**
 * for
 * 시작값, 종료값 랜덤으로 입력받아서 처리
 */
public class ForExample3 {
	public static void main(String[] args) {
		int startNum, endNum;
		int k = 1;
		
		startNum = (int)(Math.random() * 100) + 1;
		endNum =  (int)(Math.random() * 100) + 1;
		
		if(startNum > endNum) {
			int temp = 0;
			temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		
		for(int i = startNum; i <= endNum; i++) {
			System.out.printf( "%02d ", i);
			if (k % 10 == 0) System.out.println();
			k++;
		}
	}
}
