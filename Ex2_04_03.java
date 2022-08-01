import java.util.Scanner;
import java.util.Random;

public class Ex2_04_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int seed = scan.nextInt();

        int[] dicesCount = dice(100, seed);

        for(int i = 0; i < dicesCount.length; i++) {
            String connectedString = multipleString("*", dicesCount[i]);
            System.out.printf("%d:%s\n", i+1, connectedString);
        }
    }

    private static int[] dice(int count, int seed) {
        Random rand = new Random(seed);
        int[] result = new int[6];

        for (int i = 0; i < count; i++) {
            int diceNum = rand.nextInt(6) + 1;
            result[diceNum - 1] += 1;
        }
        return result;
    }

    private static String multipleString(String str, int count) {
        String connectedString = "";
        for (int i = 0; i < count; i++) {
            connectedString += str;
        }
        return connectedString;
    }
}