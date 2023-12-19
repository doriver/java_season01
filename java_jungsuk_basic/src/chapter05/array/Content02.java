package chapter05.array;

import java.util.Arrays;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.random()); // 0.08146103486041611 이런것들 나옴
		
		int[] iArr1 = new int[10];
		int[] iArr2 = {1,2,3,4,5};
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = (int)( Math.random() * 10 ) + 1; // 1~10 랜덤값을 배열에 저장
		}
		System.out.println(Arrays.toString(iArr1)); // [4, 9, 6, 10, 9, 8, 10, 10, 10, 3]
		
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(Arrays.toString(chArr)); // [a, b, c, d, e]
		System.out.println(chArr); // abcde
		
		// 총합 , 평균 , 최대 최소
		int sum = 0;
		float average = 0;
		
		int[] score = {79, 92, 31, 100, 57};
		
		for (int i = 0; i <score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		System.out.println(sum + " , " + average); // 359 , 71.8

		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println(max + " , " + min); // 100 , 31
		
		
	}

}
