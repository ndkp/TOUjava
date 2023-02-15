
/*
標準入力に入力した100桁以下の整数値を文字列として読み込むと，
その整数値を，長桁計算のために，1の位から上位に向かって各位の値を整数値として配列の先頭から順に格納し，
その後，配列に格納した長桁の整数値を上位から順に1桁ずつ出力するプログラム
*/
import java.util.Scanner;

public class 演2Quiz_06_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[100];

        String num = scan.next();
        int na = num.length();
        for (int i = 0; i < na; i++) {
            a[na - 1 - i] = (int) (num.charAt(i) - '0');
        }

        int i = na - 1;
        while (i >= 0) {
            System.out.print(a[i--]);
        }
    }
}
