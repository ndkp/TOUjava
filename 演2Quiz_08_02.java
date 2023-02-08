import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class 演2Quiz_08_02 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File(args[0]));
            int a = file.nextInt();
            int b = file.nextInt();
            int c = a + b;
            while (file.hasNext()) {
                a = file.nextInt();
                b = file.nextInt();
                if (a + b < c)
                    c = a + b;
            }
            System.out.println(c);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
