// 課題[4-1]のソースファイル
/*
作成日:2023年1月17日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2つの正の整数値を入力すると，
これらの整数値の最小公倍数を計算し，
標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数a,bを宣言して標準入力に入力した整数値を読み込む
        int a = scan.nextInt();
        int b = scan.nextInt();

        // lcmメソッドの呼び出し
        System.out.println(lcm(a, b));
    }

    // ユークリッド互除法によりaとbの最大公約数を求める
    public static int gcf(int a, int b) {
        // aをbで割った時のあまりを変数rとして宣言する
        int r;
        while ((r = a % b) != 0) {
            a = b;
            b = r;
        }
        return b;
    }

    // aとbの最大公約数dを用いてaとbの最小公倍数を求める
    public static int lcm(int a, int b) {
        return a * b / gcf(a, b);
    }

}
