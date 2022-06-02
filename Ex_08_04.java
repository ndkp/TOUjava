import java.util.Scanner;

public class Ex_08_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
        
            String str = scan.nextLine();

            int sum = 0;
            for (int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if(c != ' '){
                    sum += 1;
                }
            }
            System.out.println(sum);

            
        }
    }
}