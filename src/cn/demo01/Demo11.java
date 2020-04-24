package cn.demo01;

public class Demo11 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40 , 50};

        System.out.println(array);
        printArray(array);
        System.out.println("==============");


    }


    // three keys:
    // return type (no calculate, no result) -----> use void
    // method (printArray)
    // parameter list (int[] array)

    public static void printArray(int[] array) {
        System.out.println("received parameter: ");
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }




}
