package list;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(4);
		integerList.add(8);
		System.out.println(integerList); // [4, 8]
		
		integerList.add(1, 5);
		System.out.println(integerList); // [4, 5, 8]
		System.out.println(integerList.get(0)); // 4
		
		integerList.set(0, 10);
		System.out.println(integerList); // [10, 5, 8]
		
		Integer deleteNumber = integerList.remove(0);
		System.out.println(integerList); // [5, 8]
		System.out.println(deleteNumber); // 10
		
		integerList.clear();
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
//		} // apple bear         ..  i = 1 일때 stringList.size() 가 2로 바뀜
		
		for (String element : stringList) {
			System.out.print(element + " ");
			
			if (element.startsWith("b")) {
				stringList.remove(element);
			}
		} //  apple bear    .. 이것도 위에꺼랑 비슷하게 되네 ..  0번쨰, 1번째 원소를 지칭하는듯?
		System.out.println();
		
		System.out.println(stringList); // [apple, chair]
		
	}

}
