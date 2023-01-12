// 課題[2-2]のソースファイル
/*
作成日:2023年1月10日
作成者:菅原萌
== プログラムの目的 ==
コマンドライン入力に整数値を入力すると，
作成したメソッドを使用して，入力した整数値の平均値を求め，
結果を標準出力に出力するプログラム
*/

import java.util.Scanner;

public class 演2Ex_02_02 {
    public static void main(String[] args) {

        // コマンドライン入力の要素があるときのみ標準出力する
        if (args.length > 0) {
            System.out.printf("%.2f", calcAverage(generateArray(args)));
        }
    }

    /*
     * 𝑛個の要素で構成される int 型の配列を引数として受け取り，
     * 配列内の全要素の平均値を返すメソッド
     */
    public static double calcAverage(int[] intArray) {
        // int型の配列内の全要素の合計値sum
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        // sumをint型の配列内の個数で割って平均値を返す
        return sum / intArray.length;
    }

    // String型の配列をint型の配列に変換するメソッド
    public static int[] generateArray(String[] strArray) {
        int[] result = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            // Stringをintに変換して返り値用の配列に格納する
            result[i] = Integer.parseInt(strArray[i]);
        }
        return result;
    }

}
