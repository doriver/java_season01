package interface_1;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		myCat.cry(); // 야옹
		myCat.eating(); // 냠
		
		Animal animal = new Cat();
		animal.cry(); // 야옹
//		animal.eating(); 이건 안됨
	}

}
