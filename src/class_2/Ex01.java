package class_2;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kimm = new Person("김또깡", "19930324", "ㅁ");
		kimm.introduce();
		System.out.println();
		
		Person kim = new Person("김또깡", "19930324", "남자");
		kim.setName("이또깡");
		kim.setGender("여자");
		
		kim.introduce();
		
		kim.setName("신또깡");
		System.out.println(kim.getName());
		
	}

}
