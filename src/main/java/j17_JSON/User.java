package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize => (Object -> Json) 변환할 때 사용
 * deserialize => (Json -> Object) 변환할 때 사용
 */

@Builder
@Data

public class User {
	@Expose(serialize = true , deserialize = true)
	private String username;
	@Expose(serialize = false, deserialize = false ) // user를 json 으로 변환할 때 password를 포함할건가 안할건가
	private String password;
	@Expose(serialize = true , deserialize = false )
	private String name;
	@Expose(serialize = true, deserialize = true )
	private String email;

}
