package j06_반복;
//파일명 변경 shift + f6
//카피 f5
public class Loop1 {
    public static void main(String[] args) {

        int n = 10;
        int j = 20;
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i < n - 1) {
               System.out.print(", ");
            }
        }
        System.out.println();
        for (int k = 10; k < 20; k++) {
            System.out.print(k);
            if (k < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int i = 10; i > 0; i--) {
            System.out.print(i);
            if (i < n + 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int k = 20; k > 10; k--) {
            System.out.print( k);
            if (k < n + 1) {
                System.out.print(", ");
            }
        }
    }
}


/* 내가 짠 코드
int n = 10;
        int j = 20;
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i < n - 1) {
                System.out.print(", ");
                }
        for (int i = 0; i < n; i++) {
            System.out.print(i + 10);
            if (i < n - 1) {
                System.out.print(", ");
                }
          for (int i = 0; i < n; i++) {
            System.out.print(n - i);
            if (i < n - 1) {
                System.out.print(", ");
                }
          for (int i = 0; i < n; i++) {
            System.out.print(n- i + 10);
            if (i < n - 1) {
                System.out.print(", ");
                }
 */
