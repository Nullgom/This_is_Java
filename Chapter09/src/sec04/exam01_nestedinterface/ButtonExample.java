package sec04.exam01_nestedinterface;
// 버튼 이벤트 처리
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		// 익명 객체 처리
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
	}

}
