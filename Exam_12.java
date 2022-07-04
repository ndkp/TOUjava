import java.util.Scanner;

public class Exam_12 {
    public static void main(String[] args) {
        int[] data = {79,90,48,39,70,63,83,71,55,98};

        int min = data[0];
        for(int i=1; i<=10; i++){
            if (data[i]==min) {
                min = data[i];
            }
        }
        System.out.println(min);
    }
}
