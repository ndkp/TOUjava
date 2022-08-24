// [演習課題8-1]のソースファイル
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex2_08_03 {
    public static void main(String[] onigiri) {
        final String FILE_NAME = "pi_1000.txt";

        Scanner scan = new Scanner(System.in);
        int readLength = scan.nextInt();
        scan.close();

        int[] counter = new int[10];
        String piString = "";

        try {
            File fileName = new File(FILE_NAME);
            Scanner file = new Scanner(fileName);
            piString = file.next();
            file.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }

        for(int i = 0; i < readLength + 2; i++) {
            int number = Character.getNumericValue(piString.charAt(i));
            if (number > -1) {
                counter[number] += 1;
            }
        }

        int max = 0;

        for(int i = 0; i < counter.length; i++) {
            max = max < counter[i] ? counter[i] : max;
        }

        for(int i = 0; i < counter.length; i++) {
            if (counter[i] == max) {
                System.out.printf("%d:%d\n", i, counter[i]);
            }
        }
    }
}
