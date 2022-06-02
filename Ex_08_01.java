// [演習課題8-1]のソースファイル
import java.util.Scanner;

public class Ex_08_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a= new int[5];
        for (int i=0; i<5; i++){
            a[i] = scan.nextInt();
        }

        for (int i=4; i>-1; i--){
            System.out.println(a[i]);
        }
    }
}