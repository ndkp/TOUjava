public class data1_03_01 { 
    public static void main(String[] args) {
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++){
            a[i] = i;
            //(1)
            System.out.println(a[i]);
        }
        System.out.println("------------");


        int[] b = a;
        
            //(2)
            for(int i = 0; i < b.length; i++){
                System.out.println(b[i]);
            }
            System.out.println("------------");
        
        b[3] = 200;
        
            //(3)
            for(int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }
            System.out.println("------------");
            
            for(int i = 0; i < b.length; i++){
                System.out.println(b[i]);
            }
            System.out.println("------------");  
            
        System.out.println("a[3] = " + a[3]);
        System.out.println("b[3] = " + b[3]);
    }

}
