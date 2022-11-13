// 1から1000までの奇数の総和
public class 演Quiz_04_01 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
　