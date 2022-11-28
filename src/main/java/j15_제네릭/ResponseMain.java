package j15_제네릭;

public class ResponseMain {

    public static CMRespDto<?> response (String msg, Object data) { //<?> : 여기에 어떤 자료형이 들어올 지 모르겠다. 메서드 리턴 자료형에 보통 사용된다.
        return new CMRespDto<>(msg, data);
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("유열림")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code errer!!", "학번에 오류가 있습니다."));
    }
}
