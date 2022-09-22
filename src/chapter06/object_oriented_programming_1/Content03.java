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
