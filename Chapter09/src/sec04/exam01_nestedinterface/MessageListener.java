package sec04.exam01_nestedinterface;
// 구현 클래스
public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}
