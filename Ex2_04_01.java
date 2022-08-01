import java.util.Scanner;
import java.lang.Math;

public class Ex2_04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double height = scan.nextDouble();
        double weight = scan.nextDouble();
  
        printMessage(calcBmi(height, weight));
    }

    public static double calcBmi(double height, double weight) {
        double mheight = height * 0.01;
        double BMI = weight / (mheight * mheight);
        return BMI;
    }

    public static void printMessage(double BMI) {
        System.out.printf("%.1f\n", BMI);
        if (BMI < 18.5) {
            System.out.println("underweight") ;
        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.println("normal") ;
        } else {
            System.out.println("overweight") ;
        }
    }
}
