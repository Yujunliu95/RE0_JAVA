package API;
import java.util.Scanner;



public class ScannerAPI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("number is:  " + num);
        String str = sc.next();
        System.out.println("string is:  "+ str);

    }
}
