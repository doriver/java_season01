package chapter08.exception_handling;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(1);
		} catch (Exception e) {
			System.out.println(2);	// 실행 안됨, try블럭에 예외가 발생하지 않아 catch블럭 거치지 않고 빠져나감 			
		} // 1 
		System.out.println(3);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		try {
			System.out.println(0/0);
			System.out.println(1);	// 실행 안됨, 윗줄에서 예외 발생해서 try블럭 벗어나 발생한 예외와 일치하는 catch블럭이 있는지 찾는다
		} catch (ArithmeticException ae) {
			System.out.println(2);			
		} // 2
		System.out.println(3);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		try {
			System.out.println(1);
			System.out.println(0/0);
			System.out.println(2);	// 실행 안됨
		} catch (Exception e) {
			System.out.println(3);			
		} // 1 3
		System.out.println(4);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		try {
			System.out.println(1);
			System.out.println(0/0);
			System.out.println(2);	// 실행 안됨
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) { System.out.println("true"); }
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");			
		} // 1 true ArithmeticException
		
	}

}
