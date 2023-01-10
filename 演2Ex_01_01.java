// 課題[1-1]のソースファイル

/*
作成日:2023年1月9日
作成者:菅原萌
== プログラムの目的 ==
ある特定のボート名（A, B, C, ...）を標準入力に入力すると，
そのボートの貸出時間の総計を算出し，
標準出力に出力するプログラム．
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class 演2Ex_01_01 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File(args[0]));
            Scanner scan = new Scanner(System.in);

            String n = scan.nextLine();
            char boatName = n.charAt(0);

            int tm = 0;
            while (file.hasNext()) {
                char b = file.next().charAt(0);
                char io = file.next().charAt(0);
                int h = file.nextInt();
                int m = file.nextInt();

                // 標準入力された文字boatnameとファイルの最初の文字bが等しいときに貸出時間を計算
                if (boatName == b) {
                    switch (io) {
                        case 'I':
                            tm += 60 * h + m;
                            break;
                        case 'O':
                            tm -= 60 * h + m;
                            break;
                    }
                }
            }
            System.out.printf("%d:%02d\n", tm / 60, tm % 60);

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
