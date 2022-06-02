import java.util.Scanner;

public class Quiz_08_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            n++;
        }
        System.out.println("n:" + n);


    }
}
