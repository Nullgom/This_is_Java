// 값 목록으로 배열 생성
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

	}
/*
 * 타입[] = { 값0, 값1, 값2, 값3, ... };
 * 
 * 타입[] = 변수
 * 변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
 */
}
