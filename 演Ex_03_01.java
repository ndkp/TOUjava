// 課題[3-1]のソースファイル

/*
作成日:2022年10月26日
作成者:菅原萌
== プログラムの目的 ==
標準入力に正の整数値を入力すると，
その整数値が4桁かどうかを調べ，
4桁であれば「y」を，そうでなければ「n」を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();

        // nが4桁 → 1000以上9999以下
        if ((1000 <= n) && (n <= 9999)) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}
