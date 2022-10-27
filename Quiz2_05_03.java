public class Quiz2_05_03 {
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("c:"+c);
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
}
