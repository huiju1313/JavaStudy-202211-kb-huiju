package j07_메소드;

import static javax.management.Query.div;

public class Calc {


    /*
    1.add -> return int,parameter int x, int y
    2.sub -> return int,parameter int x, int y
    3.mul -> return int,parameter int x, int y
    4.div -> return int,parameter int x, int y
    5.mod -> return int,parameter int x, int y

     */



    public static int add(int x, int y) {
        return x + y;
    }
    public static int sub(int x, int y) {
        return x - y;
    }
    public static int mul(int x, int y) {
        return x * y;
    }
    public static int div(int x, int y) {
        return x / y;
    }
    public static int mod(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int addResult = add(a,b);
        int subResult = sub(a,b);
        int mulResult = mul(a,b);
        int divResult = div(a,b);
        int modResult = mod(a,b);

            System.out.println("a + b = " + addResult);
            System.out.println("a - b = " + subResult);
            System.out.println("a * b = " + mulResult);
            System.out.println("a / b = " + divResult);
            System.out.println("a % b = " + modResult);

    }
}
