// 課題[6-2]のソースファイル

/*
作成日:2023年2月1日
作成者:菅原萌
== プログラムの目的 ==
標準入力に100桁以下の正の整数値 𝑎 と
1桁の正の整数値 𝑚(1≦𝑚≦9) をこの順で入力すると，
𝑎 の 𝑚 倍（𝑎×𝑚）を計算して標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_06_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int DIGIT = 100;

        // 計算の元になる配列を保持するための配列a
        int[] a = new int[DIGIT];
        // 掛け算をする元になる数を保持するための変数b
        int b = 0;
        // 掛け算の計算結果を格納するための配列sum
        int[] sum = new int[DIGIT];
        // aとbそれぞれの桁の計算結果を一時的に格納する配列calc
        int[] calc = new int[DIGIT];
        
        // 標準入力された数を配列aに格納する
        String num = scan.next();
        int aLength = num.length();
        for(int i = 0; i < aLength; i++) {
            a[aLength - 1 - i] = (int)(num.charAt(i) - '0');
        }
        
        // 標準入力された掛ける数を変数bに格納する
        b = scan.nextInt();
        
        // 計算後の結果の数字の桁数を配列aの桁数に合わせる
        int sumLength = aLength;
        // 加算の繰り上がりの数を保持するための変数rを初期化
        int r = 0;
        // 掛ける数の元の数aを1桁ずつ計算する
        for(int index = 0; index <= aLength; index++) {
            // aの1桁とbの掛け算の結果を一時変数tに格納する
            int t = a[index] * b;
            // 上記で計算したtの桁数を数えるため、一時的に文字列に変換する
            String ts = Integer.valueOf(t).toString();
            // aとｂの掛け合わせの結果を計算用の配列calcに格納する
            // この時、各桁の掛け算の結果の桁数を合わせる必要があるため、
            // 配列aの桁数（= index）だけ0埋めする
            for(int j = 0; j <= index + ts.length() - 1; j++) {
                if(j < index) {
                    calc[j] = 0;
                } else {
                    calc[j] = Character.getNumericValue(ts.charAt(index + ts.length() - j - 1));
                }
            }
            
            // 資料の掛け算のロジックを参照
            for(int i = 0; i <= sumLength; i++) {
                // 掛け算の結果を格納する配列sumと各桁の計算結果を格納するcalcの各桁を足しあわせる
                // この時、計算している桁の前の桁が繰り上がっている場合（r == 1）があるので、
                // 変数rも足し合わせる
                r = sum[i] + calc[i] + r;
                // 上記の計算結果の繰り上がりを考慮した1桁のみを記録するため、
                // rを10で割ったあまりを計算の合計値を保持する配列sumに記録する
                sum[i] = r % 10;
                // 各桁の足し合わせをした結果、繰り上がる場合（r >= 10）を考慮し、
                // 変数rにrを10で割った値を保持しておく
                r /= 10;
            }
        }
        
        // 全ての掛け合わせが終わった後のタイミングで
        // 繰り上がりの数がまだ残っている場合、
        // ここまでの計算結果からさらに繰り上がるため、
        // 合計値の次の1桁に繰り上がり分の1を加算する
        if(r == 1) {
            sum[sumLength] = 1;
            sumLength++;
        }
        
        // ここまでの計算結果を出力する
        for(int i = sumLength; i >= 0; i--) {
            if(i == sumLength && sum[i] == 0) continue;
            System.out.print(sum[i]);
        }
        System.out.print("\n");
    }
}
