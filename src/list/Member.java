package list;
/*
 * List02클래스에서 사용되는 클래스임
 */
public class Member {
	private String name;
	private String phoneNumber;
	
	public Member(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "이름 : " +  this.name + "/ 전화번호 : " + this.phoneNumber;
	}
	/*
	 * 이게 없으면(toString 메서드를 Override 하지 않으면)
	 * Member클래스의 인스턴스의 참조변수를 println하면 collection.Member@26f0a63f 이런식으로나옴
	 * 
	 * 위와같이 override하고
	 * Member클래스의 인스턴스의 참조변수를 println하면 이름 : 유아인/ 전화번호 : 01000000000 이런식으로 나옴
	 */
	
}
