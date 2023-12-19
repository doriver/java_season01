package codingTest;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 각 자리수의 합
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력하세요 : ");
		int n = scanner.nextInt();
		
		System.out.print("각 자리수의 합 : " + f(n));

		System.out.println();
		
		// 공칠공칠...  패턴
		System.out.println(strPattern(7));
		System.out.println(strPattern(2));
	}
	
	/*
	 *  프로그래머스 - 각 자리수의 합
	 */
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
	
	/*
	 * 프로그래머스 - 수박수박수?
	 * 길이 n인 "수박수박수박수.."인 패턴 
	 */
	private static String strPattern(int n) {
       
		String answer = "";
        
//        for (int i = 1; i <= n; i++) {
//        	if ((i % 2) == 1) {
//        		answer += "공";
//        	} else {
//        		answer += "칠";        		
//        	}
//        }
		
		for (int i = 1; i <= (n/2); i++) {
			answer += "공칠";
		}
		
		if ((n % 2) == 1) {
			answer += "공";
		}
		
        return answer;
    }


}
