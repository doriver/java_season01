package jj.list;

import java.util.ArrayList;
import java.util.List;

public class Content02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> lll = new ArrayList<>();
		
		List<String> sss = new ArrayList<>();
		
		sss.add("12");
		sss.add("as");
		sss.add("34");
		sss.add("fg");

		List<String> kkk = new ArrayList<>();
		
		kkk.add("ㄱㅁ");
		kkk.add("99");
		kkk.add("ㅇㅇ");
		kkk.add("66");

		lll.add(sss);
		lll.add(kkk);
		
		System.out.println(lll);
		
	}

}
