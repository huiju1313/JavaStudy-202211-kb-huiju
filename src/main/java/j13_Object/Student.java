package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && Objects.equals(name, student.name); //Objects 클래스 안에 equals라는 메소드가 존재한다.
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() { // 해당 객체의 정보를 출력해주는 역할
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}

