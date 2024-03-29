package jj.list;

import java.util.ArrayList;
import java.util.List;

public class Content01 {

	public static void main(String[] args) {
		/*
		 *List
			index가 있다
			배열과 같이 같은 타입의 여러 개의 자료를 저장하는 자료구조.
			배열이 가진 메모리 낭비와 삽입 삭제의 불편함을 개선하였다.
		 */
			 	
		/*
		 * ArrayList<E>에 값 넣기 , 특정 index에 값 추가,삭제(이때 index가 하나씩 밀리고 당겨진다)
		 *  ~.add()  ,  ~.get()  ,  ~.set()  ,  ~.remove()  ,  ~.clear()			
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

		
		/*
		 * ArrayList<내가 만든 객체?>로 data들 관리하기
		 */
		
		List<Product> pList = new ArrayList<>();
		
		Product product = new Product("나초", 1000, 140);
		pList.add(product);
//		System.out.println(product);
		
		product = new Product("포카리", 1200, 55);
		pList.add(product);
		
		pList.add(new Product("햄", 1400, 60));
		pList.add(new Product("치즈", 500, 0));
		
		System.out.println(pList);
		// [(나초가격 : 1000, 재고 : 140), (포카리가격 : 1200, 재고 : 55), (햄가격 : 1400, 재고 : 60), (치즈가격 : 500, 재고 : 0)]

		// 재고개수 업데이트, 나초 10개 팔림
		for (int i = 0; i < pList.size(); i++) {
			if ( pList.get(i).getName() == "나초") {
				int stock = pList.get(i).getStock() - 10;
				pList.get(i).setStock(stock);
			}
		}
		System.out.println(pList);
//		if ( pList.get(0).getName() == "나초" ) {
//			int stock = pList.get(0).getStock() - 10;
//			pList.get(0).setStock(stock);
//		}
		
		// 재고 적은거 주문하려함, 재고 57개 이하인 상품정보
		for (int i = 0; i < pList.size(); i++) {
			if ( pList.get(i).getStock() <= 57 ) {
				System.out.println(pList.get(i));
			}
		}
//		if ( pList.get(0).getStock() <= 57 ) {
//			System.out.println(pList.get(0));
//		}
	}

}
