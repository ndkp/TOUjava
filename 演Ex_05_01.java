// 課題[5-1]のソースファイル

/*
作成日:2022年11月3日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2つの整数値を入力すると，
大きい方の整数値から小さい方の整数値まで，
1行に1つずつ順に整数値を標準出力に出力するプログラム
*/

import java.util.Scanner;

public class 演Ex_05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        for (int i = max; i >= min; i--) {
            System.out.println(i);
        }
    }
}