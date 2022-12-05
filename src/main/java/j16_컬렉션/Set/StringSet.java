package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//전체선택 후 ctrl shift f = 전체정렬

public class StringSet {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("김준일");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");

		System.out.println(nameSet); // 순서대로 출력되지 않는다.

		// System.out.println(nameSet.get); 불가능. Set은 하나만 가져올 수 없다. (get 사용이 불가능하다)
		// Set은 무조건 foreach로 해야함
		for (String s : nameSet) {
			if (s.equals("김준일")) {
				System.out.println(s);
				break;
			}
		}
		
		List<String> nameList = Arrays.asList(new String[] {"김준일", "권용범"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList); //addAll을 사용하면 list를 Set으로 옮겨준다.
		
		System.out.println(listToSet);
		
		nameSet.remove("김준일"); // 원하는 값을 지울 때 사용
		
		System.out.println(nameSet);
	}

}
