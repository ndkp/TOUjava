import java.util.Scanner;

public class Ex2_04_02 {
        public static void main(String[] args) {
        System.out.println(total(generateArray(args)));
    }

    private static int[] generateArray(String[] strArray) {
        int[] result = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            result[i] = Integer.parseInt(strArray[i]);
        }
        return result;
    }

    private static int total(int[] intArray) {
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            result += intArray[i];
        }
        return result;
    }
}
