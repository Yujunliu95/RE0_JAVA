package API;

import java.util.Random;

public class Random03 {
    public static void main(String[] args) {
        int n =  5;
        Random r = new Random();


        for (int i = 0; i < 100; i++) {

            int result = r.nextInt(n) + 1 ;
            System.out.println(result);
            
        }

    }
}
