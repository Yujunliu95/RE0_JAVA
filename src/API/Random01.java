package API;

import java.util.Random;


public class Random01 {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("Random number is: " + num);
    }

}
