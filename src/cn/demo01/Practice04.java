package cn.demo01;

public class Practice04 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));


    }


    public static boolean isSame(byte a, byte b) {
        System.out.println("two byte method");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("two short method");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("two int method");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("two long method");
        if (a == b) {
            return true;
        } else {
            return false;
        }

    }












}
