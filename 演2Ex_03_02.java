// 課題[3-2]のソースファイル

/*
作成日:2023年1月16日
作成者:菅原萌
== プログラムの目的 ==
標準入力に正の整数 𝑛 を入力すると，
半角数字を使用して，
2𝑛−1 段のひし形を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_03_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();
        // 1行出力するごとに加算される数字を保持しておくための変数c
        int c = 1;

        // 三角形をつくる
        for (int i = 1; i <= n; i++, c++) {
            // 半角スペースをn-i個表示させる
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // iを2*i-1個表示させる
            for (int j = 1; j < 2 * i; j++)
                // 1の位のみを表示させるためにcを10で割ったあまりを出力
                System.out.print(c % 10);
            // 改行する
            System.out.println();
        }

        // Ex_03_01と同様にして逆三角形をつくる
        for (int i = n - 1; i >= 1; i--, c++) {
            // 半角スペースをn-i個表示させる
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // iを2*i-1個表示させる
            for (int j = 1; j < 2 * i; j++)
                // 1の位のみを表示させるためにcを10で割ったあまりを出力
                System.out.print(c % 10);
            // 改行する
            System.out.println();
        }
    }
}
