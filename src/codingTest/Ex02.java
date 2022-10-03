package codingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex02 {
    
	public static void main(String[] args) {
	
	}

}

/*
 *		 프로그래머스 - 폰켓몬
 * 수 배열이 주어짐
 * (중복 제외했을때 개수) >= N/2 이면 N/2
 * (중복 제외했을때 개수) < N/2 이면 (중복 제외했을때 개수) 리턴
 * (중복 제외했을때 개수) 구하는게 KEY임
 */
class Solution_1 {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();     
        for (int i = 0; i < nums.length; i++) {
        	set.add(nums[i]);
        }
        
        int nl = nums.length / 2;
        if (set.size() >= nl) {
        	answer = nl;
        } else {
        	answer = set.size();
        }

        return answer;
    }
}


/*
 * 		프로그래머스 - 완주하지 못한 선수
 * 한 배열A가 있고, A의 원소중 하나(c)를 제거한 배열 B가 있다
 * c를 구하는 문제
 */
class Solution_2 {
	/*
	 * String배열도 Arrays.sort(); 되는지 몰랐음
	 */
    public String solution01(String[] participant, String[] completion) {
        String answer = "";
        
        // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때까지 찾는다
        int length = completion.length;    
        for(int i = 0; i < length; i++) {
           if( ! participant[i].equals(completion[i]) ) {
               return participant[i];
            }   
        }
        
        // 3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미이다.
        answer =  participant[length]; 
        
        return answer;
    }
    
    /*
     * 효율성에서 잘못된 풀이(배열 원소가 1000개 넘어가는 경우 )
     */
    public String solution02(String[] participant, String[] completion) {
      
    	String answer = "";
         
    	List<String> plist = new LinkedList<>(Arrays.asList(participant));   

    	// 항상 모든 원소들을 다 제거해야해서 효율이 떨어짐. 	
      	for (int i = 0; i < completion.length; i++) {
      		plist.remove(completion[i]);
      	}   
     
      	answer = plist.get(0);        
 
        
        return answer;
    }
}