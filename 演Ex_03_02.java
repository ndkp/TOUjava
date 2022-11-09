// 課題[3-2]のソースファイル

/*
作成日:2022年10月26日
作成者:菅原萌
== プログラムの目的 ==
何月かを表す正の整数値を標準入力に入力すると，
下表に従って，季節名を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_03_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数nを宣言して標準入力に入力した整数値を読み込む
        int n = scan.nextInt();

        switch (n) {
            // 3,4,5が入力されたとき
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            // 6,7,8が入力されたとき
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            // 9,10,11が入力されたとき
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            // 12,1,2が入力されたとき
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            // それ以外の整数値が入力されたとき
            default:
                System.out.println("none");
                break;
        }
    }
}
