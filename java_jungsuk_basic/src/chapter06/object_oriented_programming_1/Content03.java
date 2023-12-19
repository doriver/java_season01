package chapter06.object_oriented_programming_1;

class MyMath2 {
	long a, b;
	
	// 인스턴스 변수a,b만을 이용하여 매개변수가 필요 없다
	long add() { return a + b; } // a,b는 인스턴스 변수
	double divide() { return a / b; }

	// 인스턴스변수와 관계없이 매개변수만으로 작업 가능
	static long add(long a, long b) { return a + b; } // a,b는 지역변수
	static double divide(long a, long b) { return a / (double)b; }	
}

public class Content03 {
	public static void main(String[] args) {
		// 클래스메서드 호출(인스턴스 생성없이 호출 가능)
		System.out.println(MyMath2.add(200, 50) 
				+ " , " + MyMath2.divide(200, 50)); // 250 , 4.0
		
		MyMath2 mm = new MyMath2();
		mm.a = 200;
		mm.b = 50;
		// 인스턴스 메서드는 객체 생성후 호출 가능
		System.out.println(mm.add() + " , " + mm.divide()); // 250 , 4.0
	}
}

class TestClass {
	void instanceMethod() {} // 인스턴스 메서드
	static void staticMethod() {} // 클래스 메서드
	
	void instanceMethod2() {
		instanceMethod(); //
		staticMethod();
	}
	
	static void staticMethod2() {
//		instanceMethod(); // 에러 , 같은 클래스 내에서 static메서드는 인스턴스메서드를 호출할수 없다
		staticMethod();
	}
}

class TestClass2 {
	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {
//		System.out.println(iv); // 에러 , 같은 클래스 내에서 static메서드는 인스턴스변수를 사용할수 없다
		System.out.println(cv);
	}
}