package class_1;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		
		rectangle.printRectangle(); // 가로0, 높이0
		System.out.println(rectangle.calculateArea()); // 0
		
		rectangle.width = 10;
		rectangle.height = 8;
	
		rectangle.printRectangle();
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculateArea(5));

		Rectangle rect1 = rectangle;
		rect1.printRectangle(); // 가로10, 높이8
		rect1.width = 30;
		
		rect1.printRectangle(); // 가로30, 높이8
		rectangle.printRectangle(); // 가로30, 높이8   왜그런거냐
		
		rect1 = new Rectangle();
		rect1.printRectangle(); // 가로0, 높이0
		rectangle.printRectangle(); // 가로30, 높이8
		
		
		Rectangle[] rectangles = new Rectangle[100];
		for(int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle();
		}
		
		rectangles[30].printRectangle(); // 가로0, 높이0

		System.out.println();
		
		//
		
		Goods shrimGgang = new Goods();
		shrimGgang.name = "새우깡";
		shrimGgang.price = 1300;
		shrimGgang.expiration = "2021-03-02";
		
		System.out.println("제품 5개의 가격 : " + shrimGgang.calculationPrice(5));
		
		if (shrimGgang.availableSale("2020-09-28")) {
			System.out.println("판매가능");
		} else {
			System.out.println("판매불가");
		}
		
		
	}

}
