package cn.demo01;

public class Practice09 {
    public static void main(String[] args) {
/*      int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            array2[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");

        }*/
        int[] array = {1, 2, 3, 4, 5};


        for (int min = 0, max = array.length - 1; min < max; min++, max--)  {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }




    }
}
