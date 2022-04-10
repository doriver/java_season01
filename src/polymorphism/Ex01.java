package polymorphism;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("누렁이");
		Cat cat = new Cat("나비");
		
		dog.cry();
		cat.cry();
		dog.eat();
		cat.eat();
		
		
	}

	
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}
}
