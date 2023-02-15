
/* 標準入力に入力した正の整数値が3桁かどうかを調べ
，3桁であれば「y」を，そうでなければ「n」を標準出力に出力するプログラム */
import java.util.Scanner;

public class 演2Quiz_06_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if ((n / 100 == 0) && (n / 1000 > 0)) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }

    }
}
