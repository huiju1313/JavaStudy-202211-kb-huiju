package j02_변수;

import j01_출력.SystemOut;

/**
 * 클래스에 대한 설명
 */

public class Variale {

    /**
     * 메소드에 대한 설명 /**
     * @param args
     */
    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " + checkFlag);

        char name1 = '김';
        char name2 = '준';
        System.out.println(" " +name1 + name2);
        System.out.println(Integer.toHexString(name1));
        System.out.println("\uae40");

        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);

        String sWidth1 = "100";
        String sWidth2 = "200";
        System.out.println(sWidth1 + sWidth2);

        double dNum1 = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum1 + dNum2);

        System.out.println("<<<< 형변환 >>>>");

        //업캐스팅
        //문자->정수->실수 (생락가능)

        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int)c1) + 10); // 정수로 형변환 후 덧셈 연산 가능
        int n1 = (int) c1;
        System.out.println(n1);
        double d1 = (double) n1; // 회색처리가 된 것은 생략가능하다는 뜻
        System.out.println(d1);


        //다운캐스팅
        //실수->정수->문자 (생략 불가능)
        int n2 = (int) d1;
        System.out.println(n2);
        char c2 = (char) n2;
        System.out.println(c2);

    }
}
