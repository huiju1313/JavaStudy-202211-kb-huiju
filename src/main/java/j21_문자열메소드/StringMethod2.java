package j21_문자열메소드;

public class StringMethod2 {
	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		String tempRoles = roles;
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") +2);
		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") +2);
		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());

		for(String role : roleArray) {
			System.out.println(role);
		}
		
		String[] roleArray2 = roles.split(", "); // ", "를 기준으로 다 잘라서 배열로 만들어라 : split
		for(String role : roleArray2) {
			System.out.println(role);
		}
	}

}
