package j13_Object;

import java.util.Objects;
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");


        System.out.println(str == str2); // true 같은 주소
        System.out.println(str.equals(str2)); // true 같은 주소

        System.out.println(str); //A 출력시 주소값이 아닌 값이 나온다.
        System.out.println(str2); //A
        System.out.println(str3); //A
        System.out.println(str == str3); //false 다른 주소

        System.out.println(str.toString()); // A toString()은 object 클래스에 들어있는 메소드이다.

    }
}
