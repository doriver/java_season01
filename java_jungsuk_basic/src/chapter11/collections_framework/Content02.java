package chapter11.collections_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0"); // ~.push()  스택에 저장
		st.push("1");
		st.push("2");
		
		q.offer("0"); // ~.offer()  큐에 저장 , 성공/실패 하면 true/false
		q.offer("1");
		q.offer("2");
		
		System.out.println(" = Stack = ");
		System.out.println(st);
		while (! st.empty()) { // ~.empty()  스택이 비어있는지
			System.out.println(st.pop()); // ~.pop() 스택의 맨 위(가장 마지막)에 저장된거 출력후 삭제 , 비어있으면 EmptyStack Exception발생
			System.out.println(st);
		}
		
		System.out.println();
		
		System.out.println(" = Queue = ");
		System.out.println(q);
		while (! q.isEmpty()) { // ~.isEmpty()  컬렉션이 비어있는지
			System.out.println(q.poll()); //  ~.poll()  큐의 맨 아래(처음)에 저장된거 출력후 삭제 , 비어있으면 null반환
			System.out.println(q);
		}

	}

}
