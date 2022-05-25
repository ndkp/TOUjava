public class Quiz_05_08 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            if(i%3 == 0) continue;
            if(i == 6) break;
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
