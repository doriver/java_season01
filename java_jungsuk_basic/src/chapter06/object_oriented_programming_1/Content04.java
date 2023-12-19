package chapter06.object_oriented_programming_1;

class Point {

	Point() {} // 매개변수가 없는 생성자
	
	Point(int x, int y) {} // 매개변수가 있는 생성자
}


public class Content04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1 d1 = new Data_1(); // 컴파일러가 기본 생성자 Data_1() 를 추가해서 오류 안남
		
//		Data_2 d2 = new Data_2(); // 에러 , Data_2() 라는 생성자를 찾을수 없다
		Data_2 d2 = new Data_2(3);
		
		Car c1 = new Car();
		c1.color = "w";
		c1.gearType = "a";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		System.out.println(c2.color + " , " + c2.gearType + " , " + c2.door);
		// white , auto , 4
		
		Car2 c3 = new Car2();
		Car2 c4 = new Car2("blue");
		
		System.out.println(c3.color + " , " + c3.gearType + " , " + c3.door);
		// white , auto , 4
		System.out.println(c4.color + " , " + c4.gearType + " , " + c4.door);
		// blue , auto , 4
	}

}

class Car2 {
	String color;
	String gearType;
	int door;

	Car2() {
		this("white", "auto", 4);
		// Car2(String color, String gearType, int door) 를 호출
	}
	
	Car2(String color) {
		this(color, "auto", 4);
		// Car2(String color, String gearType, int door) 를 호출
	}

	Car2(String color, int door) {
		this(color, "auto", 0);
		// Car2(String color, String gearType, int door) 를 호출
		this.door = door;
	}
	
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}


class Car {
	String color;
	String gearType;
	int door;
	
	Car() {}
	
//	Car(String c, String g, int d) {
//		color = c;
//  //인스턴스변수 생성자의 매개변수 
//		gearType = g;
//		door = d;
//	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
//		인스턴스 변수   생성자의 매개변수
		this.gearType = gearType;
		this.door = door;
	}
}

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) {
		value = x;
	}
}
