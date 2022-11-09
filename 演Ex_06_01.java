// 課題[6-1]のソースファイル

/*
作成日:2022年11月9日
作成者:菅原萌
== プログラムの目的 ==
標準入力に5つの整数値を入力すると，
それらを配列に格納し，
入力した順の逆順で1行に1つずつ標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_06_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}