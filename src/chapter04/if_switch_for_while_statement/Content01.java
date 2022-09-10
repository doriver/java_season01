package chapter04.if_switch_for_while_statement;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if (score > 60) {
			System.out.println("합격");
		}
		
		if (score == 40) {
			System.out.println("40");
		} else {
			System.out.println("40아님");
		}
		
		//  ...  60    70    80    90   100    
		if (score >= 90) { // 90이상
			System.out.println("A");
		} else if (score >= 80) { // 80이상 90미만
			System.out.println("B");
		} else if (score >= 70) { // 70이상 80미만
			System.out.println("C");
		} else { // 70미만
			System.out.println("D");
		}

		
		char grade = ' ';
		char opt = '0';
		
		if (score >= 90) { // 90이상
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) { // 80이상 90미만
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else { // 80미만
			grade = 'C';
		}
		System.out.printf("%c%c", grade, opt);
		
		System.out.println();
		int month = 9;
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			default:
				System.out.println("겨울");
		}
		
		
	}

}
