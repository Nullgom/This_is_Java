package sec05.exam01_anonymous_extends;
// 익명 자식 객체 생성
public class Anonymous {
	// 필드 초기값으로 대입
	Person field = new Person() {
		String name = "홍길동";
		String studentNo;
		
		void work() {
			System.out.println(name + "은 출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println(name + "은 6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
