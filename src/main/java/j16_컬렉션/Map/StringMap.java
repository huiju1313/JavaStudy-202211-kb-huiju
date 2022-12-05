package j16_컬렉션.Map;


import java.util.HashMap;
import java.util.Map;

public class StringMap {
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
		
		language.put("java", "자바");
		language.put("htnl", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬");
		
		
		System.out.println(language);
		
		String s = language.get("java");
		System.out.println(s);
		
		language.replace("java", "자바", "자바2");
		System.out.println(language.get("java"));
		
		language.remove("python2");
		System.out.println();
	}

}
