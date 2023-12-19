package chapter04.if_switch_for_while_statement;

import java.util.Scanner;

public class Content03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		while (true) {
			if (sum > 100) {
				break;
			}
			++i;
			sum += i;
		}
		
		System.out.println(i + " , " + sum); // 14 , 105
		
		for (i = 0; i <= 10; i++) {
			if ( i % 3 == 0 ) {
				continue;
			}
			System.out.print(i + " , ");
		} // 1 , 2 , 4 , 5 , 7 , 8 , 10 , 
		System.out.println();
		System.out.println(i); // 11 
		
		
		// 이름붙은 반복문, for문에 Loop1이라는 이름을 붙였다
		Loop1 : for (i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				if (j == 5) {
					break Loop1; // 2단을(2 * 4)까지만 출력
//					break; // 각 구구단을 ( * 4)까지만 출력
//					continue; // 각 구구단에서  * 5 만 제외
				}
				
				System.out.println(i + " * " + j + " = " + i*j );
			}
			System.out.println();
			
		}
		
		int menu = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		outer: // while문에 outer라는 이름을 붙인다
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 계산(1~3)을 선택하세요(종료는0) : ");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if ( !(1 <= menu && menu <= 3) ) {
				System.out.println("메뉴를 잘못선택했습니다, 다시 보여드릴께요");
				continue;
			}
			
			for ( ; ; ) {
				System.out.print("계산할 값을 입력하세요(계산종료는0 , 전체종료는 99) : ");
				tmp = scan.nextLine();
				num = Integer.parseInt(tmp);
				
				if (num == 0) {
					break; // 계산종료 for문을 벗어난다
				}
				
				if (num == 99) {
					break outer; // for문과 while문 모두 벗어난다. 전체종료
				}
				
				switch (menu) {
					case 1:
						System.out.println(num * num);
						break;
					case 2:
						System.out.println(Math.sqrt(num));
						break;
					case 3:
						System.out.println(Math.log(num));
						break;
				}	
			} // for ( ; ; )의 끝
			
		} // while의 끝
		
	} // main의 끝

}
