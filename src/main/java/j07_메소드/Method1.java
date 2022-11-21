package j07_메소드;

public class Method1 {
    //return(x) 매개변수(x)
    public static void method1() {
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }

    //return(x) 매개변수(1개)
    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
    }

    //return(o) 매개변수(2개)
    public static int method3(int a, int b) {
        System.out.println("메소드3 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b : " + (a + b));
        System.out.println();
        return a + b; // method3은 return이 있어서 변수가 가능하지만 1,2는 안된다
    }

//    public static int method4(int a, int b) {
//        int reselt = 0;
//
//        if (a > b) {
//            reselt b;
//        } else {
//            reselt a; // return을 만나면 메소드를 탈출한다. 다음 동작은 존재하지 않는다.
//        }


        public static void main(String[] args) {
            method1(); // 메소드 호출 => System.out.println("메소드1 호출"); 을 실행시킨다
            System.out.println("메소드1 호출 후 출력");
            method2(10); // 매개변수
            int result1 = method3(3000, 7000); // 동작의 결과를 result1에 대입을 한다.
            System.out.println("result1 : " + result1);
        }
    }

