package cn.demo01;

public class Demo09 {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA); //address

        arrayA[1] = 10;
        arrayA[2] = 20;

        System.out.println(arrayA); // address remains the same
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20

        System.out.println("=============================");

        int[] arrayB = arrayA;
        System.out.println(arrayB); //address

        arrayB[1] = 100;
        arrayB[2] = 200;

        System.out.println(arrayB); // address remains the same
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
    }
}
