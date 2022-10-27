import java.util.Scanner;

public class 演Quiz_02_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        double area = Math.PI*Math.pow(r,2.0);
        System.out.printf("area:%.1f\n", area);
    }
}
