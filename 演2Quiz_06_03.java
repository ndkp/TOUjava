public class 演2Quiz_06_03 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;

        int p = a[1] + a[3];
        int q = a[0] * a[2];
        int r = a[4] + p + q;

        System.out.println(r);
    }
}
