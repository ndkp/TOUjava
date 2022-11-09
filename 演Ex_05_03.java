// 課題[5-3]のソースファイル

/*
作成日:2022年11月3日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2つ以上の正の整数値を入力すると，
入力した全整数値の最大値，最小値，合計値，平均値を
標準出力に出力するプログラム
*/

import java.util.Scanner;

public class 演Ex_05_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;
        int min = 0;
        double count = 0;
        double sum = 0;

        while (scan.hasNextInt()) {
            int n = scan.nextInt();

            if (n > max)
                max = n;
            if (n < min || min == 0)
                min = n;
            sum += n;
            count++;
        }

        System.out.printf("%d\n%d\n%.0f\n%.2f", max, min, sum, sum / count);
    }
}