// 課題[6-2]のソースファイル

/*
作成日:2022年11月9日
作成者:菅原萌
== プログラムの目的 ==
標準入力に1個以上10個以下の整数値を入力すると，
それらの平均値を計算し標準出力に出力するとともに，
入力した各値と平均値の差を標準出力に1行ずつ出力するプログラム

*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_06_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 平均を表す変数avg
        double avg = 0.0;
        // 標準入力を格納する変数array
        double array[] = new double[10];
        // 標準入力の数を表す変数count
        double count = 0;

        // 標準入力から入力された値を変数arrayにひとつづつ格納する
        for (int i = 0; i < 10; i++) {
            // 標準入力で読み込めるデータがない場合,処理を中断する
            if (!scan.hasNext())
                break;
            array[i] = scan.nextInt();
            count++;
        }

        // 入力した整数値がない場合,または11個以上の場合は,「-1」を出力する
        if (count == 0 || (count >= 10 && scan.hasNext())) {
            System.out.println("-1");
            return;
        }

        double sum = 0;
        // 変数arrayの中身をひとつづつ取り出して足し合わせる(配列の合計値を出す)
        for (int i = 0; i < count; i++) {
            sum += array[i];
        }
        // 平均の計算し出力
        avg = sum / count;
        System.out.printf("%.1f\n", avg);

        // 入力した整数値を出力後,その整数値と平均値の差を小数点以下1桁まで出力
        for (int i = 0; i < count; i++) {
            System.out.printf("%.0f:%.1f\n", array[i], array[i] - avg);
        }
    }
}