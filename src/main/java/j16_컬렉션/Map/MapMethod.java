package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@gmai.com");
		map.put("age", "29");
		map.put("gender", "true");
		
		Map<String, String> address = new HashMap<>();// 순서대로 출력x
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로 1285");
		
		map.put("address", address);
		
		Map<Integer, String> subject = new TreeMap<>();// 순서대로 출력된다. TreeMap
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(400, "python1");
		subject.put(500, "python2");
		subject.put(600, "python3");
		
		map.put("subject", subject);
		
		System.out.println(map);
		System.out.println();
		
		
		System.out.println(((Map<Integer, String>)map.get("subject")).get(600));
		
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		System.out.println(((List<String>)map.get("hobby")).get(2)); //Object를 List로 다운캐스팅 하는 것
		
		Set<Entry<String, Object>> userEntry = map.entrySet();
		
//		List<Map<String, Object>> listMap = new ArrayList<>();
		
		for(Entry<String, Object> entry : userEntry) { // map 안에 있는 key와 value를 하나로 담는게 entry
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		Set<String> names = new HashSet<>();
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");
		
		System.out.println(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		
		
		
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key)); // 각각의 key값으로 value를 뽑아내는 것
		}
		
		System.out.println("==================================");
		System.out.println(map.values());
		
		System.out.println();
		
		for(Object obj : map.values()) {
			System.out.println(obj);
		}

	}

}
