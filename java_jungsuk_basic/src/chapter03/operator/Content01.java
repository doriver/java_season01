package chapter03.operator;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3, j=0;
		j = i++; // j메 i가 대입된 후에 i값이 1증가
		System.out.println("i = " + i + ", j = " + j); // i = 4, j = 3
		
		i = 3;
		j = 0;
		j = ++i; // i를 1증가시키고 j에 대입
		System.out.println("i = " + i + ", j = " + j); // i = 4, j = 4
		
		System.out.println(i++); // 4 , i값 출력후에 1증가시킴
		System.out.println(++j); // 5 , j값 1증가후 출력함
		System.out.println("i = " + i + ", j = " + j); // i = 5, j = 5
		
		double d = 85.4;
		int score = (int)d;
		System.out.println( d + " , " + score); // 85.4 , 85
		
//		int a = (int)'A';
//		char c = (char)65;
		System.out.println( (int)'A' + " , " + (char)65 ); // 65 , A
		
		float f = 255;
//		byte b = 500;  // 에러 : byte타입의 범위(-128 ~ 127)를 벗어난 값의 대입
		byte b = (byte)500;
		System.out.println( f + " , " + b); // 255.0 , -12
		
		System.out.println(13 / 4 + " , " + 13 % 4); // 3(나눈 몫) , 1(나눈 나머지)
		System.out.println(13 / 5 + " , " + 13 % 5); // 2 , 3
		System.out.println(7 / 2 + " , " + 7 / (double)2 + " , " + 7 / 2.0 ); // 3 , 3.5 , 3.5
		System.out.println(Math.round(4.54) + " , " +  Math.round(4.13592 * 100) / 100.0);
		// 5(소수 첫째자리에서 반올림) , 4.14(소수 셋째자리에서 반올림, 다른자리에서 반올림 하기위해 10의 n제곱을 곱하고 나눠줌)
		
		System.out.println("abc" == "abc"); // true
		System.out.println("abc".equals("abc")); // true
		
		System.out.println();
		
		String str = new String("abc");
//		String str = "abc"; 위 문장을 간단히 표현
		System.out.println(str); // abc
		System.out.println(str == "abc"); // false
		System.out.println(str.equals("abc")); // true
		
		System.out.println();
		
		String str1 = "abc";
		System.out.println(str1); // abc
		System.out.println(str1 == "abc"); // true
		System.out.println(str1.equals("abc")); // true
		
		System.out.println();
		// '=='는 완전히 같은지 비교 , equals()는 내용이 같은지 비교
		System.out.println(str == str1); // false
		System.out.println(str.equals(str1)); // true
		
	}

}
