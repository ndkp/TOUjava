import java.util.Scanner;

public class 演Quiz_04 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        /*
         * for (int i = 0; i < n; i--) {
         * System.out.println(i);
         * } 無限
         */

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
