
/*
作成日:2022年10月26日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2つの正の整数値 𝑚,𝑛（0<𝑚,𝑛≤10,000）をこの順に入力すると,
𝑚から𝑛までの整数について,
整数とその2乗値を1行にして,順に標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数m,nを宣言して標準入力に入力した整数値を読み込む
        int m = scan.nextInt();
        int n = scan.nextInt();

        if (m <= n) {
            for (int i = m; i <= n; i++) {
                System.out.printf("%d:%d\n", i, i * i);
            }
        }
    }
}
