package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) { // 오버라이드 할 때 자료형은 바꾸면 안 되지만 매개변수는 바꿀 수 있다.
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Student student = new Student(20220001, "고희주");
        Student student2 = new Student(20220001, "고희주");

        System.out.println(student.toString());
        System.out.println(student); // 언급하지 않아도 toString()이 호출된다.
        System.out.println(student2);

        System.out.println(student == student2); // 주소값 비교 = false
        System.out.println(student.equals(student2));
//        public boolean equals(Object obj) {
//            return (this == obj); // this = student, obj = student2를 뜻함
//        }

        System.out.println();

        print(student); // object 객체가 들어와야 하는데 student가 object를 상속받고 있기에 가능하다.

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        Class c = student.getClass(); // "어느 패키지 안에 들어있는 어느 클래스다" 를 출력
        System.out.println(c);
        System.out.println(c.getName()); // 클래스 이름을 가져온다.
        System.out.println(c.getSimpleName()); // 진짜 클래스 이름을 가져온다.

        System.out.println();

        Field[] fields = c.getDeclaredFields(); // 해당 클래스 안에 있는 변수명을 다 가지고 온다.
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        System.out.println();

        Method[] methods = c.getDeclaredMethods(); // 해당 클래스 안에 있는 메소드를 다 가지고 온다.
        for(int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }
}
