package cn.demo01;

public class Demo07 {
    public static void main(String[] args) {
        int[] array = new int[3];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=====================");


        array[1] = 123;
        System.out.println(array[1]); // 123
    }
}
