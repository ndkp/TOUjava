// [演習課題8-1]のソースファイル
import java.util.Scanner;

public class Exam_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();
        double a = Math.PI*r*r;
        System.out.printf("%.2f\n",a);
        }
    }