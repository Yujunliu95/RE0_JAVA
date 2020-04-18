package cn.demo01;

public class Practice08 {

    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        // winner
        System.out.println(max);
    }
}
