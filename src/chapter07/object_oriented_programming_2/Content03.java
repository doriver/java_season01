package chapter07.object_oriented_programming_2;

public class Content03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		c.method(); // 20 , 20 , 10
		
		Child2 c2 = new Child2();
		c2.method(); // 10 , 10 , 10
	}

}

class Parent1 {
	int x = 10;
}

class Child1 extends Parent1{
	int x = 20;
	
	void method() {
		System.out.println( x + " , " + this.x + " , " + super.x );
		// 20 , 20 , 10
		// 상속받은 변수 x가 자신의 멤버x와 이름이 같아 super로 구분
	}
}

class Child2 extends Parent1{
	void method() {
		System.out.println( x + " , " + this.x + " , " + super.x);
		// 10 , 10 , 10
		// x , this.x , super.x 모두 같은 변수를 의미
	}
}
