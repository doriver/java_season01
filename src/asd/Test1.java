package asd;

public class Test1 {
	int age;
	String name;


	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public static void main(String[] args) {
		
		Test1 ex01 = new Test1();
		ex01.age = 4;
		ex01.name = "홍길동";
		System.out.println(ex01.age + " " + ex01.name);
		
		ex01.setAge(10);
		ex01.setName("홍당무");
		ex01.print();
		
		ex01.name="최성국윤정훈이상엽";
		System.out.println(ex01.name.length());
		System.out.println(ex01.name.substring(0, 3));
		System.out.println(ex01.name.substring(3, 6));
		System.out.println(ex01.name.substring(6, 9));
		
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	
}
