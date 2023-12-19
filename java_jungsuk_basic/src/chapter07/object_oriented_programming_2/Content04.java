package chapter07.object_oriented_programming_2;

public class Content04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
//		FireEngine f = (FireEngine)c; // 에러 java.lang.ClassCastException
		
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water(); // Unresolved compilation problem, The method water() is undefined for the type 
		fe2 = (FireEngine)car;
		fe2.water();
		
		
		Car cc = new Car();
		FireEngine ff = new FireEngine();
		
		System.out.println(cc instanceof Car);
		System.out.println(cc instanceof FireEngine);
		System.out.println(ff instanceof Car);
		System.out.println(ff instanceof FireEngine);
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("Brrrr~");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}