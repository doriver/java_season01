package chapter08.exception_handling;

public class Content03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		method1();			
//		try {
//			method1();			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception("sad");
	}

}
