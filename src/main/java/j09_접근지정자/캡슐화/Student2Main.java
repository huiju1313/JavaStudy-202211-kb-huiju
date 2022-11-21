package j09_접근지정자.캡슐화;

public class Student2Main {
    public static void main(String[] args) {
        Student2 s2 = new Student2("동아대학교", "고희주", 4, false);

        s2.showStudent2Info();
    }
}



// alt ins 사용하면 get, set and 자동 생성 가능