package chapter06.object_oriented_programming_1;

class Variables {

	int iv; // 인스턴스 변수
    static int cv; // 클래스 변수(static변수, 공유변수)
    
    void method() {
		int lv = 0; // 지역변수    
    }

}


public class Content02 {
	public static void main(String[] args) {
		
		System.out.println( Card.width + " , " + Card.height); // 100 , 250
		// 클래스 변수(static변수)는 객체생성없이 '클래스이름.클래스변수'로 직접 사용 가능
		
		Card c1 = new Card(); c1.kind = "Heart"; c1.number = 3;
		Card c2 = new Card(); c2.kind = "Spade"; c2.number = 8;
		
		System.out.println("c1은 " + c1.kind + c1.number 
				+ " 이고, 크기는 (" + c1.width + "," + c1.height + ")");
		// c1은 Heart3 이고, 크기는 (100,250)
		System.out.println("c2은 " + c2.kind + c2.number 
				+ " 이고, 크기는 (" + c2.width + "," + c2.height + ")");
		// c2은 Spade8 이고, 크기는 (100,250)
		
		System.out.println();
		c1.width = 50; // Card.width = 50;
		c1.height = 70; // Card.height = 70;
		// Card.width  ,  c1.width  ,  c2.width 는 모두 같은 저장공간을 참조 
		
		System.out.println("c1의 크기는 (" + c1.width + "," + c1.height + ")");
		// c1의 크기는 (50,70)
		System.out.println("c2은 크기는 (" + c2.width + "," + c2.height + ")");
		// c2은 크기는 (50,70)
	}
}

class Card {
	
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
}