package list;

import java.util.ArrayList;
import java.util.List;

public class List01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List만들기
		List<Integer> iList = new ArrayList<>();
		iList.add(3);
		iList.add(8); // 리스트에 값 넣기
		iList.add(9);
		iList.add(4); 
		iList.add(2);
		System.out.println(iList); // [3, 8, 9, 4, 2]

//		0 1 2 3 4 5
		
		// 값 수정하기 (4번째 값을 6으로 바꾸기)
		iList.set(3, 6); 
		System.out.println(iList); // [3, 8, 9, 6, 2]
		
		// 값 삽입하기 (3번째 위치에 10을 삽입)
		iList.add(2, 10); 
		System.out.println(iList); // [3, 8, 10, 9, 6, 2]
		
		// 값 삭제 (8, 9 삭제)
		iList.remove(1);
		iList.remove(2);
		System.out.println(iList); // [3, 10, 6, 2]
		
		// 최소값 구하기
		int min = iList.get(0);
		
//		if (min > iList.get(1)) {
//			min = iList.get(1);
//		}
//		이렇게 하나 구체적으로 해보고 아래와같이 구현함

		for (int i = 1; i < iList.size(); i++) {			
			if (min > iList.get(i)) {
				min = iList.get(i);
			}
		}
		System.out.println(min); // 2
		
		// 합계 구하기
		int sum = 0;
		
//		sum += iList.get(0);
		
		for (int i = 0; i < iList.size(); i++) {
			sum += iList.get(i);			
		}
		System.out.println(sum); // 21
		
		// 짝수인값 삭제
//		여기서 Iterator가 쓰이는듯
		
		if ( (iList.get(0) % 2) == 0 ) {
			iList.remove(0);
		}
	}

}
