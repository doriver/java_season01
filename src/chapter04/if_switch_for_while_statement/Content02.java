package chapter04.if_switch_for_while_statement;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		for (int i =1; i <= 10; i+=2) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i*=3) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		
		for (int i = 1; i <= 5; i++) {
			for(int j=1; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
