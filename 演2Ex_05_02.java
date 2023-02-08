// 課題[5-2]のソースファイル

/*
作成日:2023年1月25日
作成者:菅原萌
== プログラムの目的 ==
次の漸化式で定義される数列 𝑔𝑛 を考えます：

　　𝑔0=0,𝑔1=0,𝑔2=1,
　　𝑔𝑛+3=𝑔𝑛+2+𝑔𝑛+1+𝑔𝑛(𝑛≧0)

コマンドライン入力に非負の整数値 𝑛(𝑛≧0) を入力すると，
𝑔𝑛 を計算しその結果を標準出力に出力するプログラム
*/

public class 演2Ex_05_02 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        System.out.printf("g(%d):%d", n, g(n));
    }
    
    public static long g(int n) {
        long[] f = new long[n + 1];
        for(int i = 0; i <= n; i++) f[i] = -1;
        long ans = fibo(n, f);
        return ans;
    }
    
    public static long fibo(int n, long[] f) {
        if (f[n] != -1) return f[n];
        else if (n <= 1) {
            f[n] = 0;
            return f[n];
        } else if (n == 2) {
            f[n] = 1;
            return f[n];
        } else {
            f[n] = fibo(n - 1, f) + fibo(n - 2, f) + fibo(n - 3, f);
            return f[n];
        }
    }
}