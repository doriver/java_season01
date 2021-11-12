package inheritance;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(); // 응애응애 자식 생성    .. 부모 생성자 호출호 자식 생성자 호출
		
		Student student2 = new Student("김또깡", "남자", 25, "서울대"); 
		student2.introduce(); // 김또깡25남자입니다
		student2.printInfo(); // 김또깡25남자입니다 , 서울대다니는중
	}

}
