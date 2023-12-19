package interface_1;

public class Cat implements Animal{
	
	public void eating() {
		System.out.println("냠");
	}
	
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}
