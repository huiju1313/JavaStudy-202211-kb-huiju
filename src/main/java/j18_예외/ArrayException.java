package j18_예외;

public class ArrayException {
	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] {1, 2, 3, 4, 5};
		
		try {
			//예외가 예상되는 부분
		
		for(int i=0; i<6; i++) {
			System.out.println(numberArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("예외가 생성됨");
			
		}
		
		System.out.println("프로그램 정상 종료");
		
	}

}
