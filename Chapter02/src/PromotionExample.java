// �ڵ� Ÿ�� ��ȯ
public class PromotionExample {
	public static void main(String[] args) {
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		byte byteValue = 10;
		int intValue = byteValue;  // int <- byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;  // int <- char
		System.out.println("���� �����ڵ�=" + intValue);
		
		intValue = 500;
		long longValue = intValue;  // long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;  // double <- int
		System.out.println(doubleValue);
	}
}
