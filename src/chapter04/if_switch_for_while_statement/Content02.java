package chapter04.if_switch_for_while_statement;

import java.util.Scanner;

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
		
		int i = 1; // 초기화
		
		while (i <= 10) { // 조건식
			System.out.print(i + ",");
			i++; // 증감식
		}
		System.out.println();
		
		// 1부터 몇까지 더해야 100을 넘지 않는지 알아보기
		// 1 2 3 4 5 6 ....
		i = 0;
		int sum = 0;
		while (sum <= 100) {
			System.out.println(i + "까지 더했을때 -  값 : " + sum);
			sum += ++i;
		}
		// 첫블럭에서 i = 0+1 , sum = 0 + i = 1
		// 두번 블럭에서 i = 1+1 = 2 , sum = 1 + i = 1 + 2 = 3
		// 3번 블럭에서 i = 2+1 = 3 , sum = 1 + 2 + i = 1 + 2 + 3 = 6
		// 4번 블럭에서 i = 3+1 = 4 , sum = 1 + 2 + 3 + 4 = 10

		
		
		// 숫자의 각 자리의 합 구하기
		int num = 123456;
		sum = 0;
		while(num != 0) {
			sum += num%10;
			System.out.println(sum + " , " + num);
			num /= 10;
		} // num = 12 -> +2 , num = 1 -> +1 , num = 0 -> while문 종료
		System.out.println(sum);

		
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이 정수를 입력하시오 : ");
			input = scan.nextInt();
			
			if (input > 58) {
				System.out.println("더 작은수 시도해 보시오");
			} else if (input < 58) {
				System.out.println("더 큰수 시도해 보시오");
			}
		} while (input != 58);
		System.out.println("정답입니다");
	}

}
