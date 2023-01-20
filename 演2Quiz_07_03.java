public class 演2Quiz_07_03 {
    public static void main(String[] args) {
        String str = "TokyoOnlineUniverstiy";

        for (int i = 0; i < 5; i++) {
            if (('A' <= str.charAt(i)) && (str.charAt(i) <= 'Z')) {
                System.out.print((char) (str.charAt(i) - 'A' + 'a'));
            } else {
                System.out.print((char) (str.charAt(i)));
            }
        }
    }
}
