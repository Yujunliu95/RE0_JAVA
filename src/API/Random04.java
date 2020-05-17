package API;

import java.util.Random;
import java.util.Scanner;

//     1. 产生一个随机数字， Random的nextInt
//    2. 需要键盘输入，需要Scanner中的nextInt
//    3. if判断，大了、小了、中了
//    4. 错了的话要再来一次，循环次数不确定，用while(true) 死循环

public class Random04 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; // [1:100]

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入猜测的数字: ");
            int guessNum = sc.nextInt(); // 键盘输入猜测的数字

            if (guessNum > randomNum) {
                System.out.println("太大了");

            } else if (guessNum < randomNum) {
                System.out.println("太小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }

        System.out.println("游戏结束");



    }
}
