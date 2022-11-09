// [演習課題5-2]のソースファイル

/*
作成日:2022年11月3日
作成者:菅原萌
== プログラムの目的 ==
標準入力に華氏温度（℉）を表す2つの整数値 𝑓1,𝑓2(𝑓1≤𝑓2) をこの順に入力すると，
以下のことを行うプログラム

𝑓1>𝑓2 の場合は，何もしない．
𝑓1 度から 𝑓2 度の間で，華氏温度の値が5の倍数の場合の温度について，
摂氏温度（℃）に変換し，変換した摂氏温度を小数点以下1桁まで出力する．

*/

import java.util.Scanner;

public class 演Ex_05_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f1 = scan.nextInt();
        int f2 = scan.nextInt();

        if (f1 <= f2) {
            for (double i = f1; i <= f2; i++) {
                if (i % 5.0 == 0.0) {
                    System.out.printf("%.0f:%.1f\n", i, 5.0 / 9.0 * (i - 32.0));
                }
            }
        }
    }
}