import java.util.Scanner;

public class Quiz_08_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            n++;
        }
        System.out.println("n:" + n);

    }
}
