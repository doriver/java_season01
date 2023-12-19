package list;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *List
	index가 있다
	배열과 같이 같은 타입의 여러 개의 자료를 저장하는 자료구조.
	배열이 가진 메모리 낭비와 삽입 삭제의 불편함을 개선하였다.
 */
	 	
			
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(4);
		integerList.add(8);
		integerList.add(7);
		integerList.add(3);  // add한 순서대로 저장됨
		System.out.println(integerList); // [4, 8, 7, 3]  ,  참조변수를 println했더니 이렇게 나오네, 보통은 주소값 나옴
		
		integerList.add(1, 5); // index 1번에 5를 추가
		System.out.println(integerList); // [4, 5, 8, 7, 3]
		System.out.println(integerList.get(0)); // 4 (index 0번 값)
		
		integerList.set(0, 10); // index 0번값을 10으로 바꾼다
		System.out.println(integerList); // [10, 5, 8, 7, 3]
		
		Integer deleteNumber = integerList.remove(0); // index 0번값을 제거한다. 그에 따라 index가 자동으로 마춰짐, 그리고 제거된 값이 결과값이 됨. 
		System.out.println(integerList); // [5, 8, 7, 3]
		System.out.println(deleteNumber); // 10
		
		integerList.clear(); // list의 모든 값을 제거
		System.out.println(integerList); // []
		
		//
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("apple");
		stringList.add("bear");
		stringList.add("chair");
		System.out.println(stringList); // [apple, bear, chair]
		
//		for (int i = 0; i < stringList.size(); i++) {
//			System.out.print(stringList.get(i) + " ");
//			
//			String element = stringList.get(i);
//			if (element.startsWith("b")) {
//				stringList.remove(i);
//			}
//		} // apple bear  ..  i = 1 일때 stringList.size() 가 2로 바뀜 , 그래서 for문에서 i는 1까지밖에 실행이 안되고 chair는 출력 안됨
		
		for (String element : stringList) {
			System.out.print(element + " ");
			
			if (element.startsWith("b")) {
				stringList.remove(element);
			}
		} // apple bear .. 이것도 위에꺼랑 비슷하게 되네. bear가 제거되고, chair가 1번째 원소로 되고 list의 마지막 index는 1이 됨. 저런식의 for문도 index기반해서 0번쨰, 1번째 원소를 뽑아서 하는듯?
		
		System.out.println();
		
		System.out.println(stringList); // [apple, chair]
		
	}

}
