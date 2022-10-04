package jj.queue;

import java.util.LinkedList;
import java.util.Queue;

//	ArrayDeque 클래스는 스택과 큐 메모리 구조를 모두 구현하는데 가장 적합한 클래스입니다.

public class Content01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성(린크드 리스트만으로도 되네)
		//Deque<String> qu = new ArrayDeque<String>();

		// add() 메소드를 이용한 요소의 저장
		qu.add("하나");
		qu.add("둘");
		qu.add("셋");
		qu.add("넷");

		// peek() , 요소의 반환 ( 가장 빨리 저장된거 )
		System.out.println(qu.peek());
		System.out.println(qu);

		// poll() , 요소의 반환 및 제거 ( 가장 빨리 저장된거 )
		System.out.println(qu.poll());
		System.out.println(qu);

		// remove() , 요소의 반환 및 제거 ( 가장 빨리 저장된거 )
		System.out.println(qu.remove());
		System.out.println(qu);
		
		
		Queue<Integer> q = new LinkedList<>();

		// 데이터 삽입
		q.offer(1);
		q.offer(2);
		q.offer(3);

		// 데이터 출력& 삭제
		q.peek(); // 1 출력 
		q.poll(); // 1 출력 후 삭제

		// 데이터 삭제
		q.remove(); // 2 삭제
		q.clear(); // 모든 데이터 삭제
	}

}
