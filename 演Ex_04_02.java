// 課題[4-2]のソースファイル

/*
作成日:2022年10月26日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2つの正の整数値 𝑛, 𝑑（0<𝑑,𝑛≤100,000）をこの順に入力すると，
1 から 𝑛 までの 𝑑 の倍数の総和を計算し，
計算結果を標準出力に出力するプログラムを作成してください
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_04_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数n,dを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();
        int d = scan.nextInt();

        int sum = 0;
        /*
         * iがdで割り切れるときだけsumにその数を足すことを
         * iがnになるまで行う
         */
        for (int i = 1; i <= n; i++) {
            if (i % d == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
