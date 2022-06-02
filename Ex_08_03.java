import java.util.Scanner;

public class Ex_08_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int min = n;
        int max = n;
  
        while (true) {
            if (!scan.hasNextInt()) break;
            int m = scan.nextInt();
            if (m < min) {
                min = m;
            }
            if (m > max) {
                max = m;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
