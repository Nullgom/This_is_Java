package sec10.exam03_singleton;

public class Singleton {
	private static Singleton singletone = new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singletone;
	}
}
