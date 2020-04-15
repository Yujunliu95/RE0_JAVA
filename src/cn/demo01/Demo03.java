package cn.demo01;

public class Demo03 {
    public static void main(String[] args) {
    method(10,20);
    method2();
    }

    public static void method (int a, int b) {
        int result =  a * b;
        System.out.println("Result: " + result);
    }

    public static void method2 () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Helloworld" + i);
        }
    }

}
