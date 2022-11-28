package j14_스태틱.빌더;
//이게 빌더의 안에 있는 것들

//@Builder 하면 안에 생기는 것들
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 전체 생성자
@ToString
public class Student {
    private int studentCode;
    private String name;
    private  String address;


    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private  String address;

        public StudentBuilder studentCode(int studentCode) { // 메서드명은 변수명이랑 매개변수명까지 다 일치
            this.studentCode = studentCode;
            return this; // 자기 자신의 주소를 리턴함 studentCode 이거
        }

        public StudentBuilder name(String name) { // 메서드명은 변수명이랑 매개변수명까지 다 일치
            this.name = name;
            return this; // 자기 자신의 주소를 리턴함 studentCode 이거
        }

        public StudentBuilder address(String address) { // 메서드명은 변수명이랑 매개변수명까지 다 일치
            this.address = address;
            return this; // 자기 자신의 주소를 리턴함 studentCode 이거
        }

        public Student build() {
            return new Student(studentCode, name, address);
        }


    }
}
