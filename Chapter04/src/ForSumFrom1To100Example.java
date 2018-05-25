//1 부터 10까지 출력하기
public class ForSumFrom1To100Example {
	
	public static void main(String[] args) {
		int sum = 0; // 합계 변수
		int endNum = 100;
		
		for(int i = 1; i <= endNum; i++) {
			sum += i;
		}
		System.out.println("\n1부터 " + endNum + "까지 합: " + sum);
	}
}
