public class 演2Quiz_08_03 {
    public static void main(String[] args) {
        演2_Sample02 a = new 演2_Sample02(10, 20, 30);
        演2_Sample02 b = new 演2_Sample02(27, 33, 15);
        演2_Sample02 c = new 演2_Sample02(35, 55, 15);

        int d = a.z + b.y + c.x;
        System.out.println(d);
    }
}
