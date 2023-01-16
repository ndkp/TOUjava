// 課題[3-1]のソースファイル

/*
作成日:2023年1月16日
作成者:菅原萌
== プログラムの目的 ==
標準入力に正の整数 𝑛 を入力すると，
半角文字「*」を使用して，
𝑛 段の逆三角形を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j < 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
