package API;
import java.util.Scanner;


public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字: ");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("The result is: " + result);
    }


}
