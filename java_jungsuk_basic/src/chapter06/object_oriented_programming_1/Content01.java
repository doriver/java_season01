package chapter06.object_oriented_programming_1;

// 하나의 소스파일( *.java )에 둘 이상의 클래스를 정의하는것도 가능하다. 
// 소스파일 이름은 public class의 이름과 일치해야 한다
// public class가 없다면 소스파일 이름은 소스파일내의 어떤 클래스의 이름으로 해도 상관없다.

// 클래스파일( *.class )은 클래스마다 하나씩 만들어지므로
// Content01.java를 컴파일 하면 Content01.class와 Tv.class 2개의 클래스파일이 생성된다

public class Content01 {
	
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + " 입니다");
		
		System.out.println(t); // chapter06.object_oriented_programming_1.Tv@7637f22
	}
	
}

class Tv {
	
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}
