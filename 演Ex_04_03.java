// 課題[4-3]のソースファイル

/*
作成日:2022年10月26日
作成者:菅原萌
== プログラムの目的 ==
標準入力に正の整数値 𝑛（0<𝑛<109）を入力すると，
その整数値の下位の桁から上位に向かって順に，
標準出力に1行に1桁ずつ出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_04_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数m,nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();

        /*
         * まずは1の位の数字が欲しいので,ｎを10で割ったあまりを計算し出力
         * その後桁数を一つ減らすためにｎを10で割った商を計算する
         * 上記をｎが0より大きい間繰り返す
         */
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}
