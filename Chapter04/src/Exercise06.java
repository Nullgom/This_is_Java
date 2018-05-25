// º°Ç¥·Î »ï°¢Çü Ãâ·Â
public class Exercise06 {
	public static void main(String[] args) {
		
		System.out.println("----- »ï°¢Çü -----");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ¿ª »ï°¢Çü
		System.out.println("\n----- ¿ª»ï°¢Çü -----");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
