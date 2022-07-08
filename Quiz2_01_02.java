public class Quiz2_01_02 {
    public static void main(String[] args) {
        int a = 7, b = 5;

        int x = sum(a,b);
        System.out.println(x);

        double y = sum(a,b);
        System.out.println(y);

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(int a, int b){
        return (double)(a+b);
    }
    
}