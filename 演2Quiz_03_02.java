public class 演2Quiz_03_02 {
    public static void main(String[] args) {
        int[] a = { 6, 5, 4, 3, 2, 1 };
        int x = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                x += a[n - 1 - i];
        }
        System.out.println(x);
    }
}
