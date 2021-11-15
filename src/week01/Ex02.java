package week01;

public class Ex02 {
    
	// 공칠공칠공칠...  패턴 
	private static String strPattern(int n) {
       
		String answer = "";
        
//        for (int i = 1; i <= n; i++) {
//        	if ((i % 2) == 1) {
//        		answer += "공";
//        	} else {
//        		answer += "칠";        		
//        	}
//        }
		
		for (int i = 1; i <= (n/2); i++) {
			answer += "공칠";
		}
		
		if ((n % 2) == 1) {
			answer += "공";
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
	
//		System.out.println(strPattern(7));
//		System.out.println(strPattern(2));
		
		
	}

}
