// [演習課題8-2]のソースファイル

public class Ex2_08_02 {
    public static void main(String[] args) {
        int[] array = generateIntArray(args);
        quickSort(array, 0, array.length - 1);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = array[ (pl + pr) / 2];

        while(pl <= pr) {
            while(array[pl] < pivot) pl++;
            while(array[pr] > pivot) pr--;
            if(pl <= pr) {
                int tmp = array[pl];
                array[pl] = array[pr];
                array[pr] = tmp;
                pl++;
                pr--;
            }
        }

        if(left < pr) quickSort(array, left, pr);
        if(pl < right) quickSort(array, pl, right);
    }

    private static int[] generateIntArray(String[] strArray) {
        int[] result = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            result[i] = Integer.parseInt(strArray[i]);
        }
        return result;
    }
}
