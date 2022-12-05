package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class Gson2 {
	public static void main(String[] args) {
		
		User user = User.builder()
				.username("junil")
				.password("1234")
				.name("김준일")
				//.email("junil@gamil.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls() // 을 넣어주면 null이 출력된다.
				.excludeFieldsWithoutExposeAnnotation() //이것을 추가하면 정보가 안 뜬다. 
				//@Expose(serialize = false ) || true로 바꾸면 뜬다.
				//각자 선언해줘야 한다.
				.create();
		
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		
		User userObj = null;
		
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
	}

}
