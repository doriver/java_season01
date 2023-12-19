package chapter03.operator;

import java.util.Scanner;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요 :");
		
		String input = scan.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
			// 문자ch는 숫자('0' ~ '9')이다
			System.out.println("입력한 문자는 숫자입니다");
		}
		
		if ( ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') ) {
			// 문자ch는 소문자 또는 대문자이다
			System.out.println("입력한 문자는 영문자 입니다");
		}
		
		
	}

}
