package j03_연산자;

public class Operation1 {
    public static void main(String[] args) {
        boolean a = 100 % 4 ==0;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a && a);
        System.out.println(b && b);

        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);
    }
}

