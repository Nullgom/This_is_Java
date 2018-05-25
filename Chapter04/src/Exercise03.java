// 1부터 100까지 정수 3의 배수
public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
//		for(int i = 3; i <= 100; i += 3) {
//			System.out.println(i);
//			sum += i;
//		}
		
		System.out.println(sum);		
	}
}
