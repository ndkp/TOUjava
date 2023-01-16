// 課題[3-3]のソースファイル

/*
作成日:2023年1月16日
作成者:菅原萌
== プログラムの目的 ==
サイコロを 𝑛 回振り，
出た目の値を各要素に格納した配列を返すメソッドを作成し，
このメソッドを使用してサイコロを100回振ったときの，
各目が出た回数を集計しヒストグラムとして標準出力に出力するプログラム
*/

import java.util.Scanner;
import java.util.Random;

public class 演2Ex_03_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int seed = scan.nextInt();

        int[] dicesCount = dice(100, seed);

        for (int i = 0; i < dicesCount.length; i++) {
            String connectedString = multipleString("*", dicesCount[i]);
            System.out.printf("%d[%d]%s\n", i + 1, connectedString.length(), connectedString);
        }
    }

    private static int[] dice(int count, int seed) {
        Random rand = new Random(seed);
        int[] result = new int[6];

        for (int i = 0; i < count; i++) {
            int diceNum = rand.nextInt(6) + 1;
            result[diceNum - 1] += 1;
        }
        return result;
    }

    private static String multipleString(String str, int count) {
        String connectedString = "";
        for (int i = 0; i < count; i++) {
            connectedString += str;
        }
        return connectedString;
    }
}