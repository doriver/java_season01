package inheritance;

// Person은 부모클래스 , Student는 자식클래스
// Student : Person을 확장해서 만든 클래스
public class Student extends Person{
	private String school;
	
	public Student() {
		System.out.println("자식 생성");
	}
	
	public Student(String name, String gender, int age, String school) {
		super(name, gender, age);
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
		this.school = school;
	}
	
	public void printInfo() {
		super.introduce();
//		System.out.println(name + gender + age + "입니다");
		System.out.println(school + "다니는중");
	}
}
