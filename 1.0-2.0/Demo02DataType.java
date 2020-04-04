public class Demo01DataType {
    public static void  main(String[] args) {

        // right(long) -----> left(int) will return error
        // int num = 100L;
        // System.out.println(num);
        int num = (int) 100L;
        System.out.println(num);


        int num2 = (int) 60000000000L;
        System.out.println(num2); //1705032704

        char zifu1 = 'A';
        System.out.println(zifu1 +1); //66, A=65

        byte num4 = 40;
        byte num5 = 50;
        // byte + byte --> int + int ---> int
        int result1 = num4 + num5;
        System.out.println(result1); // 90








    }
}