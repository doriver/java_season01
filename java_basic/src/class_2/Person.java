package class_2;

public class Person {
	private String name;
	private String birthday;
	private String gender;
	
	public Person() {
		System.out.println("출생신고");
	}
	
	public Person(String name, String birthday, String gender) {
		this();
		this.name = name;
		this.birthday = birthday;
		
		if (gender.equals("남자") || gender.equals("여자")) {
			this.gender = gender;
		} else {
			System.out.println("성별을 잘못입력 했습니다.");
		}
	}
	
	public Person(String name) {
		this(name, "00000", "남자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.startsWith("신")) {			
			this.name = name;
		}
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + "성별은 " + this.gender);
	}
	
}
