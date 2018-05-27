package sec03.exam04_outterclass_ref;

// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
