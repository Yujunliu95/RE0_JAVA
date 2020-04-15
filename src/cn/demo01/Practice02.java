package cn.demo01;

public class Practice02 {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 0 ; i <= 100; i++) {
            sum += i;

        }
        return sum;
    }
}
