package cn.demo01;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));

    }

    public static boolean isSame(int a, int b){
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }
}
