package class_1;

public class Person {
	String name;
	String birthDay;
	String gender;
	
	int getAge(int currentYear) {
		int birthYear = Integer.parseInt(birthDay.substring(0, 4));
		return currentYear - birthYear + 1;
	}
	
	void greeting() {
		System.out.println("안녕하세요" + name + "입니다.");
		System.out.println("저는 " + getAge(2021) + "살" + gender + "입니다.");
	}
	
	int compareAge(Person person) {
		return this.getAge(2021) - person.getAge(2021);
	}
}
