// [演習課題8-2]のソースファイル
import java.util.Scanner;

public class Ex_08_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = 0;
        if (a<b){
            for (int i=a; i<=b; i++) {
                sum += i;
            }
            System.out.println(sum);
        }else if(a>b){
            for (int i=b; i<=a; i++) {
                sum += i;
            }
            System.out.println(sum);
        }else{
            System.out.println(a);
        }

    }
}
