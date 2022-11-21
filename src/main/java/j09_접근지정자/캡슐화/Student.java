package j09_접근지정자.캡슐화;

public class Student {
    private String name;
    public String gender;

    public Student() {} // 기본 생성자 생략되어 있음

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }

}
