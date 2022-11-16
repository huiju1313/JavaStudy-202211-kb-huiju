package j06_반복;

public class Continue2 {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            if(i%2 != 0) { // 짝수만 출력하고 싶을 떄 넣는 것 (2로 나누었을 때 0이 아닌 것은 continue밑에 있는 동작이 실행되지 않는다.
                continue;
            }
             System.out.println(i);
        }
    }
}
