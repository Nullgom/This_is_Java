package sec06.exam02_field_default_value;

// 필드 자동 초기화
public class FieldInitValue {
	//필드
	byte byteField; // 0
	short shortField; // 0
	int intField; // 0
	long longField; // 0L
	
	boolean booleanField;  // false
	char charField; // \u0000 (빈 공백)
	
	float floatField; // 0.0f
	double doubleField; // 0.0
	
	int[] arrField; // null
	String referenceField; //null
}