// 課題[2-3]のソースファイル

/*
作成日:2022年10月19日
作成者:菅原萌
== プログラムの目的 ==
標準入力に4桁以下の正の整数値（1 ～ 9999）を入力すると，
その整数値の一，十，百，千の位の値を
この順に1行に1つずつ標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_02_03 {
    public static void main(String[] args) {
        // Scannerクラスの変数scanを宣言
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();

        // 千の位の計算
        int thousands = n / 1000;
        // 百の位の計算
        int surplus = n % 1000;
        int hundreds = surplus / 100;
        // 十の位の計算
        surplus = n % 100;
        int tens = surplus / 10;
        // 一の位の計算
        surplus = n % 10;
        int ones = surplus / 1;

        // 一，十，百，千の位の順に出力
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
        System.out.println(thousands);

    }
}