package jj.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map은 Collection에 포함되지 않지만 Collecion으로 분류를 해준다

public class Content01 {

	public static void main(String[] args) {

//		map은 key , value 쌍으로 이루어진 데이터의 집합   ~~~ list에서 index랑 map에서 key가 비슷
//		key는 중복 될 수 없고, value는 중복 가능하다.
//		key를 통해서값을 찾는 속도가 빠르다.
//		value를 통해서 key 찾는 작업은 느리다.
		
//		.put()  .get()  .containsKey()  .containsValue()  .keySet()   .values()  .remove()  .putAll()
		Map<String, String> ids = new HashMap<>();

//		[인터페이스Map 타입의 참조변수].put(key, value);
//		ids.put("a","b");   {key=value, a=b, ...}
		ids.put("gang", "동원");
		ids.put("yu", "재석");
		ids.put("lee", "병헌");

		System.out.println(ids); // {gang=동원, yu=재석, lee=병헌}
		
		ids.put("gang", "호동"); // 동원이 호동으로 바뀜(key에 해당하는value 값이 바뀜)
		System.out.println(ids); // {gang=호동, yu=재석, lee=병헌}
		
		System.out.println(ids.get("gang")); 
		// 호동 .  [인터페이스Map 타입의 참조변수].get(key) 결과는 value값 . list에선 get(index) 였음 
		System.out.println(ids.get("yu")); // 재석
		
		if (ids.containsKey("gang")) { // [인터페이스Map 타입의 참조변수].containsKey() 결과는 true, false
			System.out.println("key존재");
		} else {
			System.out.println("해당 key없음");
		}
		
		if (ids.containsValue("호동")) { // [인터페이스Map 타입의 참조변수].containsValue() 결과는 true, false
			System.out.println("value 존재");
		} else {
			System.out.println("해당 value 없음");
		}
		
		Set<String> keys = ids.keySet(); 
		// map의 key들을 set의 원소로 얻는다  ,  [인터페이스Map 타입의 참조변수].keySet();
		System.out.println(keys); // [gang, yu, lee]
		
		Collection<String> values = ids.values(); // collection이 뭐였지?
		System.out.println(values); // [호동, 재석, 병헌]
		
		ids.remove("gang"); // 해당하는 key, value 쌍 삭제
		System.out.println(ids); // {yu=재석, lee=병헌}
		
		Map<String, String> newMap = new HashMap<>();
		newMap.put("lee", "효리");
		newMap.put("je", "씨");
		
		ids.putAll(newMap); // ids에 newMap을 집어늠
		System.out.println(ids); // {je=씨, yu=재석, lee=효리} 이병헌 없어지고 이효리만 남음
		
		for (String id : ids.keySet()) { // key를 통한 향상된 for문
			System.out.println(ids.get(id));
		} // 씨 재석 효리

	}

}
