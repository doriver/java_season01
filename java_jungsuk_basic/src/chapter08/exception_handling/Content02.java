package chapter08.exception_handling;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(0/0);
			System.out.println(2);	// 실행 안됨
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // java.lang.ArithmeticException: / by zero
			System.out.println("예외메시지 : " + ae.getMessage()); // 예외메시지 : / by zero
		}
		
		try {
			Exception e = new Exception("고의로 발생");
			throw e;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
