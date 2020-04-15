package cn.demo01;

import java.sql.SQLOutput;

// define PLUS on two int
// return type: int
// sum
// int  a, int b
public class Demo02 {

    public static void main(String[] args) {
        //1
        sum(10, 20);
        System.out.println("======================");

        //2
        System.out.println(sum(10,20));
        System.out.println("======================");

        //3
        int number = sum(15,25);
        number += 100;
        System.out.println("var = " + number);
    }

    public static int sum(int a, int b) {
        System.out.println("Success");
        int result = a + b;
        return result;
    }


}
