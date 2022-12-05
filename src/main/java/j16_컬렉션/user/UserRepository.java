package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor


public class UserRepository {
	@Getter
	private List<Map<String, Object>> userList;
	
	//Crate
	public void register(Map<String,Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);
	}
	
	//Read
	public Map<String, Object> findUserByUsername(String username) {
		Map<String, Object> userMap = null;
		
		for(Map<String, Object> user : userList) {
			String _username = (String) user.get("username"); //변수명에 _ 붙이면 임시로 사용하겠다는 뜻
			if(_username.equals(username)) {
				userMap = user;
				break;
			}
		}
		
		return userMap;
	}
	
	public void modifyPassword(String username, String newPassword ) { // 유저들 중에서 원하는 사람의 패스워드를 바꾸려고 한다.
		 Map<String, Object> userMap = findUserByUsername(username);
		 if(userMap == null) {
			 System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			 return; // void인데 return이 있으면 메서드를 강제로 빠져나가는 것
		 }
		 
		 userMap.replace("password", newPassword);
	}
	
	public void deleteUserByUsername(String username) { //userList에서 지워야한다.
		Map<String, Object> userMap = findUserByUsername(username);
		
		 if(userMap == null) {
			 System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			 return; //
		 }
		 int userIndex = userList.indexOf(userMap);
		
		userList.remove(userIndex);
		
	}

}
