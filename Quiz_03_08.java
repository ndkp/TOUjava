public class Quiz_03_08 {
    public static void main(String[] args) {
        int a = 2, b = 5;

        switch (a) {
            case 1:
                b = b + 1;
            case 2:
                b = b + 2;
            case 3:
                b = b + 3;
            default:
                b = b + 4;
        }
        System.out.println("b:" + b);
    }
}