package chapter04;

public class Object06 {

    public static void main(String[] args) {
        int[] array = {5, 10, 25, 30, 100};
        int max = getMax(array);
        System.out.println(max);

    }


    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }



}
