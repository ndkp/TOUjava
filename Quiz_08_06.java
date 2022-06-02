import java.util.Scanner;

public class Quiz_08_06 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int [][] b = {{1,2,3,4,5},
                      {2,4,6,8,10},
                      {3,6,9,12,15}};

        int sum = 0;
        for (int i=0; i<b.length; i++) {
            sum += a[i] + b[1][i];
        }
        System.out.println("sum:" + sum);
    }
}