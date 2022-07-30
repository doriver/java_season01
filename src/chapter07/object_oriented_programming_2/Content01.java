package chapter07.object_oriented_programming_2;

public class Content01 {
		
	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
		stv.channelUp(); // 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello, world");
		stv.caption = true;
		stv.displayCaption("Hello, hello");
		
		// 다형성
		
		Tv t = new SmartTv();	// 조상클래스타입의 참조변수로 자손클래스의 인스턴스를 참조  
//		SmartTv s = new Tv();	// Type mismatch 에러 
		
	}

}

//		상속 : 자손클래스는 조상클래스의 모든 멤버를 포함

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

//		오버라이딩 : 상속받은 메서드의 내용을 변경하는것

class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point {
	int z;
	
	String getLocation() {	// 오버라이딩
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}

//		오버라이딩 vs 오버로딩

class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	void parentMethod() {}	// 오버라이딩
	void parentMethod(int i) {}	// 오버로딩
	
	void childMethod() {}
	void childMethod(int i) {}	// 오버로딩
}