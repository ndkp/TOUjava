// 課題[1-2]のソースファイル

/*
作成日:2023年1月9日
作成者:菅原萌
== プログラムの目的 ==
ある特定のボート名（A, B, C, ...）を標準入力に入力すると，
そのボートの貸出時間の総計を算出し，
標準出力に出力するプログラム
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class 演2Ex_01_02 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File(args[0]));

            int tm, tmA, tmB, tmC, tmD, tmE;
            tm = 0;
            tmA = 0;
            tmB = 0;
            tmC = 0;
            tmD = 0;
            tmE = 0;

            while (file.hasNext()) {
                char b = file.next().charAt(0);
                char io = file.next().charAt(0);
                int h = file.nextInt();
                int m = file.nextInt();

                switch (b) {
                    case 'A':
                        tmA += calcIO(io, h, m);
                        break;
                    case 'B':
                        tmB += calcIO(io, h, m);
                        break;
                    case 'C':
                        tmC += calcIO(io, h, m);
                        break;
                    case 'D':
                        tmD += calcIO(io, h, m);
                        break;
                    case 'E':
                        tmE += calcIO(io, h, m);
                        break;
                }
                tm += calcIO(io, h, m);
            }

            if (tmA != 0) {
                System.out.printf("A %d:%02d\n", tmA / 60, tmA % 60);
            }
            if (tmB != 0) {
                System.out.printf("B %d:%02d\n", tmB / 60, tmB % 60);
            }
            if (tmC != 0) {
                System.out.printf("C %d:%02d\n", tmC / 60, tmC % 60);
            }
            if (tmD != 0) {
                System.out.printf("D %d:%02d\n", tmD / 60, tmD % 60);
            }
            if (tmE != 0) {
                System.out.printf("E %d:%02d\n", tmE / 60, tmE % 60);
            }

            System.out.printf("%d:%02d\n", tm / 60, tm % 60);

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static int calcIO(char io, int h, int m) {
        int result = 0;
        switch (io) {
            case 'I':
                result += 60 * h + m;
                break;
            case 'O':
                result -= 60 * h + m;
                break;
        }
        return result;
    }
}