// 課題[5-1]のソースファイル

/*
作成日:2023年1月23日
作成者:菅原萌
== プログラムの目的 ==
コマンドライン入力に非負の整数値 𝑛(𝑛≧0) を入力すると，
𝑛 を引数としてメソッドの呼び出し f(𝑛) を行ったときに
生じるメソッド呼び出し
（f メソッド自身の呼び出し，および，
そこから（直接にまたは再帰的に）呼び出される fibo メソッドの呼出し）
の回数を数え，
計算されたフィボナッチ数とともにその回数を標準出力に出力するプログラム
*/

public class 演2Ex_05_01 {
    private static long count = 0;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = -1;
        if (args.length >= 2) {
            m = Integer.parseInt(args[1]);
        }
        // if(m > 0 && m > n) return;
        
        if(m > 0) {
            for(int i = n; i <= m; i++) {
                calc(i);
            }
        } else {
            calc(n);
        }
    }
    
    public static void calc(int n) {
        count = 0;
        System.out.printf("f(%d):%d [%d times]\n", n, f(n), count);
    }

    public static long f(int n) {
        count++;
        long[] f = new long[n + 1];
        for(int i = 0; i <= n; i++) f[i] = -1;
        long ans = fibo(n, f);
        return ans;
    }
    
    public static long fibo(int n, long[] f) {
        count++;
        if (f[n] != -1) return f[n];
        else if (n <= 1) {
            f[n] = n;
            return f[n];
        } else {
            f[n] = fibo(n - 1, f) + fibo(n - 2, f);
            return f[n];
        }
    }
}