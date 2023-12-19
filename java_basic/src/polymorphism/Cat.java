package polymorphism;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	public void grooming() {
		System.out.println("그루밍 햘짝");
	}
}
