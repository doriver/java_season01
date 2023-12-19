package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<Integer> set1 = new HashSet<>();
			// 순서가 없다, index가 없다, 수학의 집합과 같은 특성
			
			set1.add(2);
			set1.add(4);
			set1.add(1);
			
			System.out.println(set1); // [1, 2, 4]
			
			System.out.println(set1.add(1)); // false 중복된 내용은 저장되지 않음
			
			Set<Integer> set2 = new HashSet<>();
			set2.add(10);
			set2.add(20);
			set2.add(4);
			
//			set1.retainAll(set2); 
//			System.out.println(set1); // [4] 교집합 인듯, 공통된 원소들만
			
			System.out.println(set1.addAll(set2)); // true
			System.out.println(set1); // [1, 2, 4, 20, 10] 합집합 인듯, 모든 원소들 추가
			
			if (set2.contains(10)) {
				set2.remove(10);
			}
			
			System.out.println(set2); // [20, 4]
			
			set1.removeAll(set2);
			System.out.println(set1); // [1, 2, 10] 차집합인듯
			
		
			Set<Integer> set3 = new TreeSet<>();
//			값을 정렬한다.
//			HashSet보다 상대적으로 느리다.
			set3.add(3);
			set3.add(2);
			set3.add(1);
			
			System.out.println(set3); // [1, 2, 3]
			
			// set은 index가 없기때문에 index를 이용한 for문을 사용할수 없다
			
			for (Integer number : set3) {
				System.out.println(number);
			}
			// 1 2 3

	}

}
