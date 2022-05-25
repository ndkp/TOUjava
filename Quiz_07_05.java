public class Quiz_07_05 {
    public static void main(String[] args){
        String str = "devil";
        
        int n = str.length();
        System.out.print(str + " ");
        for (int i = n-1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
