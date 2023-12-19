package chapter05.array;

import java.util.Arrays;

public class Content03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 섞기(shuffle)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr) + "-->");
		for (int i = 0; i < 100; i++) {
			int n = (int)( Math.random() * 10 ); // 0~9중 한 값을 임의로 얻음
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
		
		// 로또번호 만들기
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int tmp = 0;
		int j = 0;
		
		for (int i = 0; i < 6; i++) {
			j = (int)( Math.random() * 45 ); // 0 ~ 44 중 랜덤하게 하나 얻음
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}

}
