package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,2,2,3,4,7,7,4};
		Solution s = new Solution();
		
		
		System.out.println(Arrays.toString(s.solution01(a)));
	}

}
/*
	프로그래머스 - 같은 숫자는 싫어

( 0~9의 수 배열 )
수 배열 -> 수 배열
연속적으로 나타나는 숫자는 하나만 남기려함. 원소들의 순서를 유지(앞에서부터 차례대로)
: 수 배열에서 중복 없에기?

      A                  B  
[1,1,3,3,0,1,1] --> [1,3,0,1]
[4,4,4,3,3]     --> [4,3]

         모델링
     A           B  
[1,1,3,3,0,1,1], []
B : [] --> [1] --> [1,3] --> [1,3,0] --> [1,3,0,1] 
A의 맨 앞 원소부터 차례대로, ** B의 마지막 원소( -> Stack)와 다를때만 ** 
B의 맨 마지막에 추가한다
  
 */
class Solution {
 
    public int[] solution01(int []arr) {
    	int[] answer = {};
    	
    	Stack<Integer> st = new Stack<>();
    	st.push(arr[0]);
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (st.peek() != arr[i]) {
    			st.push(arr[i]);
    		}
    	}

    	answer = new int[st.size()];
    	
    	for (int i = 0; i < answer.length; i++) {
    		answer[answer.length - i - 1] = st.pop();
    	}
    	
    	return answer;
    }
    
    // 기회되면 이해해보기, 내 사고방식이랑은 다름
    public int[] solution02(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int point = 10;
        for(int num : arr) {
            
        	if(point != num) {            	
            	tempList.add(num);
            }
            point = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}