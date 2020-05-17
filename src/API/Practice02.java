package API;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Please Enter the third number: ");
        int c = sc.nextInt();


        int temp = a > b ? a : b;  // : 表示否则
        int max = temp > c ? temp : c;
        System.out.println("Maximum is : " + max);


    }


}
