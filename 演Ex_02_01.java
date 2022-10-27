// 課題[2-1]のソースファイル

/*
作成日:2022年10月19日
作成者:菅原萌
== プログラムの目的 ==
標準入力に正の整数値を入力すると，
その整数値を半径とする円の円周の長さを計算し，
その結果を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_02_01 {
    public static void main(String[] args) {
        // Scannerクラスの変数scanを宣言
        Scanner scan = new Scanner(System.in);

        // 変数rを宣言して標準入力に入力した整数値を読み込む
        int r = scan.nextInt();
        // 円周の長さ(2πr)を宣言したcircleに代入
        double circle = 2 * Math.PI * r;
        // 書式指定子を用い,全体を左詰めで小数点以下5桁まで出力
        System.out.printf("%.5f", circle);
    }
}
