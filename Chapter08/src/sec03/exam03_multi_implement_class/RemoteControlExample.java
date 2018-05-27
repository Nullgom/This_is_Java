package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		RemoteControl rc = stv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();		
		
		Searchable searchable = stv;	
		searchable.search("http://www.naver.com");

	}

}
