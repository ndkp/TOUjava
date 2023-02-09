// 課題[6-1]のソースファイル

/*
作成日:2023年1月31日
作成者:菅原萌
== プログラムの目的 ==
標準入力に100桁以下の2つの正の整数値 𝑎,𝑏(𝑎≧𝑏) を
この順で入力すると，それらの差（𝑎−𝑏）を計算して
標準出力に出力するるプログラム
*/

// Scannerクラスを読み込む
import java.util.Scanner;

public class 演2Ex_06_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int DIGIT = 100;

        // 変数a,bを宣言して標準入力に入力した整数値を読み込む
        int[] a = new int[DIGIT];
        int[] b = new int[DIGIT];
        int[] sum = new int[DIGIT];
        
        String num = scan.next();
        int aLength = num.length();
        for(int i = 0; i < aLength; i++) {
            a[aLength - 1 - i] = (int)(num.charAt(i) - '0');
        }
        
        num = scan.next();
        int bLength = num.length();
        for(int i = 0; i < bLength; i++) {
            b[bLength - 1 - i] = (int)(num.charAt(i) - '0');
        }
        
        int sumLength = aLength > bLength ? aLength : bLength;
        int r = 0;
        for(int i = 0; i < sumLength; i++) {
            // System.out.printf("a[%d]: %d | b[%d]: %d\n", i, a[i], i, b[i]);
            if(a[i] >= b[i]) {
                a[i] = a[i] - b[i];
            } else {
                int targetIndex = searchTargetIndex(a, i + 1);
                // System.out.printf("targetIndex: %d\n", targetIndex);
                a[targetIndex] -= 1;
                for(targetIndex -= 1; targetIndex >= i; targetIndex--) {
                    a[targetIndex] += targetIndex != i ? 9 : 10;
                    // System.out.printf("target: %d | result: %d\n", targetIndex, a[targetIndex]);
                }
                a[i] = a[i] - b[i];
            }
            // System.out.printf("a[%d]: %d\n", i, a[i]);
        }

        boolean p = false;
        for(int i = aLength - 1; i >= 0; i--) {
            if(i == aLength - 1 && a[i] == 0) {
                p = true;
                continue;
            } else if(p && a[i] == 0) {
                p = true;
                continue;
            } else {
                p = false;
            }
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }
    
    public static int searchTargetIndex(int[] array, int target) {
       return array[target] > 0 ? target : searchTargetIndex(array, target + 1);
    }
}
