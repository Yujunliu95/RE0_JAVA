package API;

import java.util.Scanner;

public class Anonymous02 {
    public static void main(String[] args) {
////
////        // 普通使用方式
////        Scanner sc = new Scanner(System.in);
////        int num = sc.nextInt();


//          匿名对象
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("Entered : " + num);



        //一般写法-----传递参数
//        Scanner sc = new Scanner(System.in);
//        methodPrarm(sc);


        //匿名对象传递参数
//        methodPrarm(new Scanner(System.in));
//


        Scanner sc = methodReturn();
        int num2 = sc.nextInt();
        System.out.println("Entered: " + num2);
    }


    public static void methodPrarm(Scanner sc) {

       int num =  sc.nextInt();
       System.out.println("Entered: "+ num);

    }

    public static  Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
          return new Scanner(System.in);

    }

}
