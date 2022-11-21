package j07_메소드;

public class Method2 {

    public static void print(String name) {
        System.out.println("이름 : " + name);
    }

    public static void print(int age) {
        System.out.println("나이 : " + age);
    }

    public static void print(String name, int age) {
        System.out.println("이름 : " + name + "나이 : " + age);
    }

    public static void print(int age, String name) {
        System.out.println("이름 : " + name + "나이 : " + age);
    }


    public static void main(String[] args) {

        print("고희주"); //spring을 넣으면 srting을 찾아가고
        print(25); // int를 넣으면 int를 찾아간다 == 메소드 오버로딩
        print("고희주", 25); // string, int 순서
        print(25, "고희주"); // int srting 순서

    }
}
