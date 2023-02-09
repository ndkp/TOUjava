// 課題[6-3]のソースファイル

/*
作成日:2023年2月1日
作成者:菅原萌
== プログラムの目的 ==
標準入力に2つの整数値 𝑥(1<𝑥<10), 𝑛(1≦𝑛≦100) を
この順で入力すると，𝑥 のべき乗（x^k , k >0）が 
𝑛 桁を超える最小の整数値を標準出力に出力するプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_06_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int DIGIT = 100;

        // 変数a,bを宣言して標準入力に入力した整数値を読み込む
        int[] sum = new int[DIGIT+1];
        int[] calc = new int[DIGIT];
        
        int x = scan.nextInt();
        int n = scan.nextInt();
        
        // int r = 0;
        int sumLength = 0;
        for(int index2 = 0; index2 < 100; index2++) {
            int currentLength = getArrayLength(sum);
            // System.out.printf("\ncurrentLength: %d\n", currentLength);
            
            if(currentLength > n) {
                for(int g = currentLength - 1; g >= 0; g--) {
                    System.out.print(sum[g]);
                }
                System.out.printf("\n");
                return;
            }
            
            int[] tmp = new int[DIGIT+1];

            
            for(int index = 0; index < currentLength; index++) {
                int t = (currentLength == 1 && sum[0] == 0) ? (x * x) : (sum[index] * x);
                
                String ts = Integer.valueOf(t).toString();
                // System.out.printf("index:%d: add number %s\n", index, ts);
                
                // 各桁を掛け算した数の桁数を合わせる
                for(int j = 0; j <= index + ts.length() - 1; j++) {
                    calc[j] = j < index ? 0 : Character.getNumericValue(ts.charAt(index + ts.length() - j - 1));
                }
                // 足し合わせる配列の準備done
                // System.out.print("calc: ");
                // for(int o = 0; o < index + ts.length(); o++) System.out.print(calc[o]);
                // System.out.print("\n");
                
                // sumLength = index + ts.length();
                // System.out.printf("length: %d(%d)\n", sumLength, ts.length());
                int r = 0;
                for(int i = 0; i < index + ts.length(); i++) {
                    r = tmp[i] + calc[i] + r;
                    tmp[i] = r % 10;
                    r /= 10;
                }
                
                if(r == 1) {
                    tmp[index + ts.length()] = 1;
                    // sumLength++;
                }
                
                // System.out.print("tmp: ");
                // for(int o = 0; o < getArrayLength(tmp); o++) System.out.print(tmp[o]);
                // System.out.print("\n");
            }
            
            sum = tmp.clone();
            sumLength = getArrayLength(sum);
            
            // if(r == 1) {
            //     sum[sumLength] = 1;
            //     sumLength++;
            // }
        }
    }
    
    public static int getArrayLength(int[] array) {
        boolean p = false;
        for(int i = 100; i >= 0; i--) {
            if(i == 100 && array[i] == 0) {
                p = true;
                continue;
            } else if(p && array[i] == 0) {
                p = true;
                continue;
            } else {
                p = false;
            }
            return i + 1;
        }
        return 1;
    }
}
