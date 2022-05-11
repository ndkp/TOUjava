import java.util.Scanner;

public class Quiz_03_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n % 2 == 1) {
            System.out.println("奇数だよ");
        } else {
            System.out.println("奇数じゃないよ");
        }
    }
}