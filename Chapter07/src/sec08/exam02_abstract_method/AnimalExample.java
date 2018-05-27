package sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------");
		
		// ������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog(); // �ڵ� Ÿ�� ��ȯ
		animal.sound(); // �����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound(); // �����ǵ� �޼ҵ� ȣ��
		System.out.println("-------------");
		
		// �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound(); // �����ǵ� �޼ҵ� ȣ��.
	}
}
