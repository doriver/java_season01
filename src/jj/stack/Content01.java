package jj.stack;


import java.util.Stack;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<Integer>(); // 스택의 생성
		 
		// push() 메소드를 이용한 요소의 저장
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);

		// peek() 메소드를 이용한 요소의 반환(스택 맨위에 있는거 반환)
		System.out.println(st.peek());
		System.out.println(st);

		// pop() 메소드를 이용한 요소의 반환 및 제거(스택 맨위에 있는거)
		System.out.println(st.pop());
		System.out.println(st); // [1, 2, 3]

		// search() 메소드를 이용한 요소의 위치 검색 , 맨 위의 요소가 1(1부터 시작, 배열을 0부터 시작)
		System.out.println(st.search(1)); // 3
		System.out.println(st.search(3)); // 1
		
		st.peek(); // 3 출력(맨위 값)
		
//		st.pop(); // 3 제거
//		st.pop(); // 2 제거
//		st.pop(); // 1 제거
		st.clear(); // 모든 데이터 제거
		
		System.out.println(st); // []
	}

}
