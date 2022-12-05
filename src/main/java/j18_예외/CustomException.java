package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException { // 여기서 오버라이드 하지 않으면 그냥 RuntimeException 인 것

	private static final long serialVersionUID = 1L;

	Map<String, String> errorMap;

	public CustomException() { // 아무것도 없을 떄
		super();
	}
	
	public CustomException(String message) { // message만 있을 때
		super(message);
	}
	
	public CustomException(Map<String, String> errorMap) { // errorMap만 있을 때
		super();
		this.errorMap = errorMap;
	}
	
	public CustomException(String message, Map<String, String> errorMap) { // message와 errorMap 둘 다 있을 때
		super(message);
		this.errorMap = errorMap;
	}


	public void printErrorMap() {
		Objects.requireNonNull(errorMap); 
		// errorMap이 null인 경우 nullPointerException을 해주는 것 
		// null일 경우 아래는 실행이 되지 않음을 방지하지 위해 try-catch 해준다.
		for (Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + " >>> " + entry.getValue());
		}
		System.out.println();

	}
}
