// 課題[2-2]のソースファイル

/*
作成日:2022年10月19日
作成者:菅原萌
== プログラムの目的 ==
標準入力に4桁以下の正の整数値（1 ～ 9999）を入力すると，
その整数値の十の位の値を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_02_02 {
    public static void main(String[] args) {
        // Scannerクラスの変数scanを宣言
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();

        /*
         * 千の位,百の位は不要なので100で割ったあまりを計算し,
         * 宣言した変数ansに代入
         */
        int ans = n % 100;
        /*
         * 整数値同士の割り算は小数点以下が切り捨てられることを利用し,
         * 10で割った商を計算する
         */
        ans = ans / 10;

        System.out.println(ans);
    }
}