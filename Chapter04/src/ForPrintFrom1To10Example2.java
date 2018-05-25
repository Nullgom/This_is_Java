//1 부터 10까지 출력하기
public class ForPrintFrom1To10Example2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i % 3 == 0) System.out.println();
			sum += i;
			//System.out.println(sum);
		}
		System.out.println("\n1부터 10까지 합: " + sum);
	}
}
