package chapter02.variable;

public class Content01 {

	public static void main(String args[]) {
		
		// 1. Console창에 글자를 출력할때 , main method 안에 System.out.print(); 을 이용
		System.out.println("hello");
		System.out.println(3+5);
		
		System.out.print(5/3);
		System.out.println("");
		// 2. 변수
		int x;
		x = 5;
		
		int y = 3;
		
		int a = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		// 3. 상수
		final int MAX_VALUE;
		MAX_VALUE = 100;
//		MAX_VALUE = 200; 오류

		// 두 변수의 값 바꾸기
		int z = 10;
		int k = 20;
		
		int tmp;
		
		tmp = z;
		z = k;
		k = tmp;
		System.out.print(z + ", " + k);
		
		
	}
	
}
