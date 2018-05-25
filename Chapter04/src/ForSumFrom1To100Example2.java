//1 부터 10까지 출력하기
public class ForSumFrom1To100Example2 {
	
	public static void main(String[] args) {
		int sum = 0; // 합계 변수
		int endNum = 100;
		
		int i = 0;
		for(i = 1; i <= endNum; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + (i-1) + "까지 합: " + sum);
	}
}
