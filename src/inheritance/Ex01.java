package inheritance;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("코인러", "남자", 29);
		person.introduce(); // 코인러29남자입니다
		
		Student student1 = new Student(); // 응애응애 자식 생성    .. 부모 생성자 호출호 자식 생성자 호출
		
		Student student2 = new Student("김또깡", "남자", 25, "서울대"); 
		student2.introduce(); // 김또깡25남자입니다 , 서울대다니는중
		student2.printInfo(); // 김또깡25남자입니다 , 서울대다니는중
		
		System.out.println();
		
		IPhone iPhone = new IPhone("010-2123-1233");
		System.out.println(iPhone.infoString());
		
		iPhone.internetBrowsing("https://www.google.com");
		iPhone.call("010-000-0000");
		
		System.out.println();
		
		FountainPen pen = new FountainPen();
		pen.refill(10);
		System.out.println(pen.getAmount());
	}

}
