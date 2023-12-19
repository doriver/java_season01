package note;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 		내가 했던 실수
		 * List는 값을 추가하면 길이가 늘어나는데 배열은 그렇지 못함
		 * 처음부터 크기가 정해져 있음
		 * 타입[] 변수이름 = new 타입[길이];
		 */
//		int[] answer = {}; // 길이 0인 배열
//		System.out.println(answer.length); // 0
//		
//		answer[0] = 0;
//		for (int i = 1; i < 10; i++) {
//			answer[i] = i;
//		}
		
		/*
		 * 향상된 for문 ?
		 * for (타입 변수 : 데이터뭉탱이) { }
		 * for (타입 변수 : 배열) { } 이경우는 앞 원소부터 뽑아서 씀
		 */
		int[] a = {1,2,3,4,5,6};
		for (int num : a) { // 1, 2, 3, 4, 5, 6,  배열의 앞 원소부터 뽑아서 씀
			System.out.print(num + ", ");
		}
	}

}
