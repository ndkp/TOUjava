// 課題[1-2]のソースファイル
/*
作成日:2022年10月19日
作成者:菅原萌
== プログラムの目的 ==
標準入力に4桁以下の正の整数値（1 ～ 9999）を入力すると，
その整数値を [] で囲んで4桁（4桁未満の場合は右詰め）で
標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_01_02 {
    public static void main(String[] args) {
        // Scannerクラスの変数scanを宣言
        Scanner scan = new Scanner(System.in);
        // 変数aを宣言して標準入力に入力した整数値を読み込む
        int a = scan.nextInt();
        // 書式指定子を用い4桁で出力(4桁未満の場合は右詰め)
        System.out.printf("[%4d]", a);
    }
}