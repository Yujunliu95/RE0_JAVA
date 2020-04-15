package cn.demo01;

public class Demo04 {
    public static void main(String[] args) {
        int num = getSum(10,20);
        System.out.println("return is" + num);
        System.out.println("==================");
        printSum(100,200);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum (int a, int b) {
        int result = a + b;
        System.out.println("result is" + result);
    }






}
