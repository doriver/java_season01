package jj.proxy;

public class HelloUppercase implements Hello{

	HelloTarget helloTarget = new HelloTarget();

	
	@Override
	public String sayHello(String name) {
		return helloTarget.sayHello(name).toUpperCase();
	}
	
	@Override
	public String sayHi(String name) {
		return helloTarget.sayHi(name).toUpperCase();
	}
	
	@Override
	public String sayThankYou(String name) {
		return helloTarget.sayThankYou(name).toUpperCase();
	}
}
