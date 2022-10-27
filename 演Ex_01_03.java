// 課題[1-3]のソースファイル

/*
作成日:2022年10月19日
作成者:菅原萌
== プログラムの目的 ==
標準入力に整数値，実数値の順で2つの数値を入力すると，
入力した値を逆の順（実数値，整数値の順）で
1行に1つずつ標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_01_03 {
    public static void main(String[] args) {
        // Scannerクラスの変数scanを宣言
        Scanner scan = new Scanner(System.in);

        // 変数aを宣言して標準入力に入力した整数値を読み込む
        int a = scan.nextInt();
        // 変数bを宣言して標準入力に入力した実数値を読み込む
        double b = scan.nextDouble();

        // 実数値は全体を左詰めで，小数点以下3桁まで出力する
        System.out.printf("%.3f\n", b);
        System.out.println(a);
    }
}
