package inheritance;

public class Person {
	
	private String name;
	private String gender;
	private int age;
//	protected String name;
//	protected String gender;
//	protected int age;
	
	public Person() {
		System.out.println("응애응애");
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println(name + age + gender + "입니다");
	}
}
