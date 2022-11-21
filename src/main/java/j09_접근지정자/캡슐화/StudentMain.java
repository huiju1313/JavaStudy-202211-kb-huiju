package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("고희주", "여");

        s1.printInfo();

        s1.setName("희주1");
        s1.printInfo();

        s1.gender = "남";
        s1.printInfo();
        System.out.println(s1.gender);
        System.out.println(s1.getName());
        //private 지만 class에 public String getName() {return name;}을 넣어줌으로써 사용 가능하게 만들었다

    }
}
