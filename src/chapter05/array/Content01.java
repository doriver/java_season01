package chapter05.array;

import java.util.Arrays;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int score1, score2, score3, score4,score5;
		int[] score = new int[5]; // 타입[] 변수이름 = new 타입[길이];
		
		System.out.println(score); // [I@182decdb , '타입@주소'형식
		
		for (int i = 0; i < 3; i++) {
			score[i] = i * 10;
		}
		
		System.out.println(score.length); // 5 , 배열이름.length 
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		} // 0, 10, 20, 0, 0, 
		System.out.println();
		
		String str = Arrays.toString(score); // Arrays.toString(배열이름)
//		import java.util.Arrays; , Arrays클래스
		System.out.println(str); // [0, 10, 20, 0, 0]
	
		
//		score = {1,2,3,4,5}; // 에러 : Array constants can only be used in initializers
		
		int[] arr = {20, 30, 40, 50};
		System.out.println(Arrays.toString(arr)); // [20, 30, 40, 50]
		
		int[] arr1;
//		arr1 = {1,2,3,4}; //에러
		arr1 = new int[]{1,2,3,4};
		System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4]
		
//		int[] arr2 = new int[]; 
		// 에러 : Variable must provide either dimension expressions or an array initializer
		
		char[] chArr = {'a', 'b', 'c'};
		System.out.println(chArr); // abc , println메서드는 char배열일때만 이렇게 동작
		
		
		
	}

}
