import java.util.Scanner;

public class Exam_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 2,b=5;
        switch (a) {
            case 1:
                b=b+1;
                break;
            case 2:
            b=b+2;
            case 3:
                b=b+3;
                break;
            default:
                b=b+4;
        }
            System.out.println("b:"+b);

        }

    }

