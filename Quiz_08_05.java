import java.util.Scanner;

public class Quiz_08_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i=0; i<5; i++) {
            int n = scan.nextInt();
            if(n>9) continue;
            sum += n;
        }
        System.out.println("sum:" + sum);


    }
}
