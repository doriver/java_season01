package note;

public class Note01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1234 % 10); // 4 , 10으로 나눈 나머지
		System.out.println(1234 / 10); // 123 , 10으로 나눈 몫
		
		// 두 변수 값 바꾸기
		int x = 10;
		int y = 20;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println(x + " , " + y); // 20 , 10
		
		
		
	}

}
