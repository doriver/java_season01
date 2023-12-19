package list;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> members = new ArrayList<>();
		
		Member member = new Member("하정우","01012341234");
		members.add(member);
		
		member = new Member("유아인","01000000000");
		members.add(member);
		System.out.println(member); // 이름 : 유아인/ 전화번호 : 01000000000
		
		members.add(new Member("송민호","01099999999"));
		
		System.out.println(members); // [이름 : 하정우/ 전화번호 : 01012341234, 이름 : 유아인/ 전화번호 : 01000000000, 이름 : 송민호/ 전화번호 : 01099999999]
		
		// 이름 출력하기
		Member people = members.get(0);
		System.out.println(people); // 이름 : 하정우/ 전화번호 : 01012341234
		System.out.println(people.getName()); // 하정우
		
		System.out.println();
		for (int i = 0; i < members.size(); i++) {
			Member element = members.get(i);
			
			String name = element.getName();
			System.out.println(name);
			
			if (name.startsWith("유")) {
				System.out.println("유씨 입니다");
			}
		}
		System.out.println();
		
		for (Member element : members) {
			System.out.println(element.getName());
		}
		
	}

}
