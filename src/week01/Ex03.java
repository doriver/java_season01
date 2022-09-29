package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * 			배열을 set으로 변환하기
		 * 배열을 List로 변경한다음 HashSet의 생성자에 넘겨주면 된다
		 * Arrays.asList() 메소드
		 * List를 HashSet의 생성자로 넘겨주면, 리스트 크기의 해시테이블을 만들고 리스트를 순회하면서 엘리먼트들을 하나씩 HashSet에 추가하는 연산을 수행한다. O(n)동작이다  
		 * 
		 * 
		 * int[]로 했다가 꼬여버림 , 찾아본 쌤플대로 하려면 Integer[]로 했어야함
		 * int[]를 Integer[]로 바꾸는 방법 : for문으로 일일이 , Stream을 이용
		 *   
		 */
		
		int[] nums = {1, 1, 3, 3, 2, 5, 4, 7};
		
//		List<Integer> ll = Arrays.asList(nums); // 에러
		// Type mismatch: cannot convert from List<int[]> to List<Integer>		
		List<int[]> ll = Arrays.asList(nums); // 에러 안남 
//		System.out.println(ll); // [[I@4361bd48]
		// List<Integer> iList = new ArrayList<>(); 원래 이걸 println하면 [3, 8, ~ ] 이런식으로 나옴
//		Set<int[]> set = new HashSet<>(ll); // 에러안남

//        Set<Integer> set = new HashSet<Integer>(Arrays.asList(nums)); // 에러
        // The constructor HashSet<Integer>(Arrays.asList(nums)) is undefined 
        Set<int[]> set = new HashSet<int[]>(Arrays.asList(nums)); // 에러는 안남
//        Set<int> set = new HashSet<int>(Arrays.asList(nums)); // 에러
        // - Syntax error, insert "Dimensions" to complete ReferenceType
      
		System.out.println(set); // [[I@4361bd48]
        // Set<Integer> set1 = new HashSet<>(); 원래 이걸 println하면 [1, 2, ~ ] 이런식으로 나옴 
		
		
		//int[]를 Integer[]로 변환 (for문을 이용)
		Integer[] inums = new Integer[nums.length];
		for(int i = 0; i < nums.length; i++) {
			inums[i] = nums[i];
		}
		System.out.println(Arrays.toString(inums)); // [1, 1, 3, 3, 2, 5, 4, 7]

		//int[]를 Integer[]로 변환 (Stream을 이용)
        Integer[] inums2 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        // Arrays.stream(배열명)으로 배열을 스트림 형태로 변경한 뒤
        // int 배열이라면 메소드 사용을 위해 .boxed()를 붙여주고(Integer일 경우 안붙임)
        // .toArray(Integer[]:new); 로 Integer 형태로 반환하면 된다
        System.out.println(Arrays.toString(inums2)); // [1, 1, 3, 3, 2, 5, 4, 7]
        
        // Set으로 변환할 배열        
		Integer[] arr = { 1, 1, 2, 2, 3, 4, 7, 5 };         
		// 배열 -> Set        
		Set<Integer> sett = new HashSet<Integer>(Arrays.asList(arr));         
		// Set 출력        
		System.out.println(sett); // [1, 2, 3, 4, 5, 7]
        
		
		String[] str = {"A", "B", "C", "D", "B", "A", "E"};
		Set<String> items = new HashSet<>(Arrays.asList(str));
		System.out.println(items); // [A, B, C, D, E]
	}

}
