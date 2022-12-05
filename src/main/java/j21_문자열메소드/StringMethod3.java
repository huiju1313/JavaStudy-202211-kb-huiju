package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber ->
		phoneNumber.replaceAll("/", "").replaceAll(" ", "").replaceAll("-", "").replaceAll("[.]", "");
		
		String phone = "010-5699/1786";
		
		System.out.println(replacePhoneToken.apply(phone)); // "- / , 공백" 을 찾아서 공백으로 바꾸라는 메서드
		
		System.out.println(phone.replaceAll("-", "")); // "-" 이 문자열을 찾아서 공백으로 바꾸라는 메서드
		
		System.out.println(phone.replaceAll("/", "")); // "/" 이 문자열을 찾아서 공백으로 바꾸라는 메서드
	}

}
