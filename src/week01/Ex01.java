package week01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 각 자리수의 합
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력하세요 : ");
		int n = scanner.nextInt();
		
		System.out.print("각 자리수의 합 : " + f(n));

	}
	
	// 각 자리수의 합
	private static int f (int n) {
		int sum = 0;
		
		while (n != 0) { // n = 2549 , 254 , 25 , 2 , 0
			sum += (n % 10); // 9 , 4 , 5 , 2 , x
			n = n / 10; // 254 , 25 , 2 , 0 , x
		}
//			 n	    n % 10
//			1234	- 4
//			123		- 3
//			12		- 2
//			1		- 1
//			0		- (n != 0) 가 false로, while문에서 나감
		return sum;
	}

}
