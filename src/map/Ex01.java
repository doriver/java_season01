package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		Map<String, String> ids = new HashMap<>();
		ids.put("gang", "동원");
		ids.put("yu", "재석");
		ids.put("lee", "병헌");

		System.out.println(ids); // {gang=동원, yu=재석, lee=병헌}
		
		ids.put("gang", "호동");
		System.out.println(ids); // {gang=호동, yu=재석, lee=병헌}
		
		System.out.println(ids.get("gang")); // 호동
		System.out.println(ids.get("yu")); // 재석
		
		if (ids.containsKey("gang")) {
			System.out.println("key존재");
		} else {
			System.out.println("해당 key없음");
		}
		
		if (ids.containsValue("호동")) {
			System.out.println("value 존재");
		} else {
			System.out.println("해당 value 없음");
		}
		
		Set<String> keys = ids.keySet();
		System.out.println(keys); // [gang, yu, lee]
		
		Collection<String> values = ids.values();
		System.out.println(values); // [호동, 재석, 병헌]
		
		ids.remove("gang");
		System.out.println(ids); // {yu=재석, lee=병헌}
		
		Map<String, String> newMap = new HashMap<>();
		newMap.put("lee", "효리");
		newMap.put("je", "씨");
		
		ids.putAll(newMap);
		System.out.println(ids); // {je=씨, yu=재석, lee=효리}
		
		for (String id : ids.keySet()) {
			System.out.println(ids.get(id));
		} // 씨 재석 효리
		
		
		
	}
}
