import java.util.Scanner;

public class Quiz_07_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char c = scan.next().charAt(0);
        if(('a'<=c)&&(c<='z')){
            System.out.println("小文字です.");
        }else{
            System.out.println("小文字ではありません.");
        }


    }
}