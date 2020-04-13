public class Demo04 {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;
        //三元
        //  int max = a > b ? a : b;
        //  System.out.println(max);

        int max;
        if (a > b) {
            max = a;
        }   else {
            max = b;
        }


        System.out.println("max:" + max);


    }
}
