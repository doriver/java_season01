package chapter07.object_oriented_programming_2.inheritance;

public class Content01 {
		
	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
		stv.channelUp(); // 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello, world");
		stv.caption = true;
		stv.displayCaption("Hello, hello");
		
	}

}


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

class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
