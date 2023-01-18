// 課題[4-2]のソースファイル

/*
作成日:2023年1月17日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2以上の整数値 𝑛 （2≦𝑛≦10,000）を入力すると，
𝑛 以下の素数の個数と最大の素数を求め，
これらを標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_04_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();

        // 要素数nの配列を宣言
        int[] num = new int[n];
        // 2からnまでの整数を並べる
        for (int i = 0; i < n - 1; i++)
            num[i] = i + 2;

        // iについて,iが消されていなければiの倍数を消す
        for (int i = 0; i < n - 1; i++) {
            // チェックする数を一時的に保持する変数aを宣言
            int a = num[i];
            for (int j = i + 1; j < n - 1; j++) {
                // 以下の条件を共に満たすものを素数ではないと判定し,0を代入
                // ・既に検証した数
                // ・2からnまでの任意の数の倍数である数
                if (a != 0 && num[j] % a == 0) {
                    num[j] = 0;
                }
            }
        }
        // 並べた整数の中で消し残った数が素数
        // 素数の個数を数えるための変数c
        int c = 0;
        // 素数の最大値を格納する変数max
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            if (num[i] != 0) {
                c += 1;
                max = num[i];
            }
        }
        System.out.printf("%d\n%d", c, max);
    }
}
