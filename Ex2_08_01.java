// [演習課題8-1]のソースファイル
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex2_08_01 {
    public static void main(String[] args) {
        final int SPRIT = 3;

        File fileName = new File(args[0]);
        try {
            Scanner file = new Scanner(fileName);
            int max = 0;
            while (file.hasNext()) {
                int sum = 0;
                for(int i = 0; i < SPRIT; i++) {
                    sum += file.nextInt();
                }
                System.out.println(sum);
                max = max < sum ? sum : max;
            }
            System.out.printf("max:%d", max);

            file.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
