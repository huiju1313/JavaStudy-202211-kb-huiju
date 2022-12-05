package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {
    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "JAva";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        //일반 반복
        System.out.println("<<<<<<< 일반 반복 >>>>>>>");
        for(int i=0; i<strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println();
        //foreach는 모든 컬렉션에서 사용 가능
        //조건 = strArray 자리가 데이터의 집합이어야 한다.
        //strArray을 꺼내서 str에 대입한다. String을 꺼내서 String변수에 넣는 것.
        //순서대로 나온다.

        //foreach
        System.out.println("<<<<<<< foreach >>>>>>>");
        for (String str : strArray) {
            System.out.println(str);
        }

        ArrayList<String> strList = new ArrayList<String>(); //list는 데이터 크기가 부족하면 자동으로 공간을 늘린다.
        // List에서 값 추가 (Create) => add(값) or add(index, 값) 사용
        strList.add("Java");
        strList.add("Jsp");
        strList.add("Servlet");
        strList.add(1, "C++"); // 1번자리에 추가하겠다.
        strList.add(0, "HTML"); // 제일 앞에 값을 추가하겠다.


        System.out.println("<<<<<<< list foreach >>>>>>>");

        for (String str : strArray) {
            System.out.println(str);
        }

        System.out.println();
        // 값 조회(Read) => get(intdex) 사용
        System.out.println("<<<<<<< list 일반 반복 >>>>>>>");

        for (int i = 0; i < strList.size(); i++) { // list는 length가 아닌 size 사용
            System.out.println(strList.get(i)); // get은 list와 map에서 사용 가능 set에서는 사용 불가능
        }

        System.out.println();

        // 값 수정(Update) => set(intdex, 값)
        strList.set(0, "HTML5");

        System.out.println(strList);

        System.out.println();

        //값 삭제(Delete) => remove(index);
        strList.remove(0);

        System.out.println(strList);

        System.out.println();

        // 값 삭제(Clear) => remove();
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);
    }
}
