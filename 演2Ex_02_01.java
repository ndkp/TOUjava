// 課題[2-1]のソースファイル
/*
作成日:2023年1月10日
作成者:菅原萌
== プログラムの目的 ==
標準入力に摂氏温度（℃）を実数値で入力すると，
入力した摂氏温度（℃）に対応する華氏温度（℉）を計算し
標準出力に出力するとともに，
計算結果に応じてメッセ―ジを標準出力に出力するプログラム
*/

import java.util.Scanner;

public class 演2Ex_02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c = scan.nextDouble();
        double f = calcFahrenheit(c);
        printMessage(f);

    }

    /*
     * 摂氏温度を引数として受け取り，
     * それを華氏温度に変換し，変換した結果を返すメソッド
     */
    public static double calcFahrenheit(double c) {
        double f = 9 * c / 5 + 32;
        return f;
    }

    /*
     * 華氏温度を引数として受け取り，
     * メッセージを標準出力に出力するメソッド
     */
    public static void printMessage(double f) {
        if (f < 50.0) {
            System.out.printf("%.1f\ncold", f);
        } else if (f >= 50.0 && f < 70.0) {
            System.out.printf("%.1f\ncool", f);
        } else if (f >= 70.0 && f < 90.0) {
            System.out.printf("%.1f\nwarm", f);
        } else {
            System.out.printf("%.1f\nhot", f);
        }
    }
}