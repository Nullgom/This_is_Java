package sec07.exam02_default_method_extends;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("ParentInterface-method2() call");
	}
}
