package jj.for_sentence;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 향상된 for문 ?
		 * for (타입 변수 : 데이터뭉탱이) { }
		 * for (타입 변수 : 배열) { } 이경우는 앞 원소부터 뽑아서 씀
		 * 
		 * 다른경우는 어쩌려나?
		 */
		int[] a = {1,2,3,4,5,6};
		for (int num : a) { // 1, 2, 3, 4, 5, 6,  배열의 앞 원소부터 뽑아서 씀
			System.out.print(num + ", ");
		}
	}

}
