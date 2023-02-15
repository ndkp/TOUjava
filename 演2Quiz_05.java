public class 演2Quiz_05 {
    public static void main(String[] args) {
        System.out.println(fact(2));
    }

    public static long fact(int n) {
        long f = 1;
        while (n > 0) {
            f *= n;
            n--;
        }
        return f;
    }
}