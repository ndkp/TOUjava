// 課題[3-3]のソースファイル

/*
作成日:2022年10月26日
作成者:菅原萌
== プログラムの目的 ==
標準入力に3つの正の整数値を入力すると，
それらの最大値を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演Ex_03_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 変数a,b,cを宣言して標準入力に入力した整数値を読み込む
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // aを最大値だと仮定して変数maxに入れる
        int max = a;

        // bがmaxより大きいときbにmaxを代入
        if (max < b) {
            max = b;
        }
        // cがmaxより大きいときcにmaxを代入
        if (max < c) {
            max = c;
        }

        System.out.println(max);
    }
}
