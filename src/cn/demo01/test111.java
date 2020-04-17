package cn.demo01;
import java.util.Scanner;
public class test111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int count = 0;
        for (int a = 1; a <= A; a++) {
            for (int b = 1; b <= B; b++){
                for (int c = 1; c <= C; c++) {
                    for (int d= 1; d <= D; d++) {

                        if (((a - b) % 3 == 0 ) &&
                                ((b + c) % 5 == 0) &&
                                ((a * c) % 4 == 0) &&
                                ( A <= 60) &&
                                ( B <= 60) &&
                                ( C <= 60) &&
                                ( D <= 60) &&
                                ( A >= 0) &&
                                ( B >= 0) &&
                                ( C >= 0) &&
                                ( D >= 0) &&
                                Byteland(a, d) == 1) {
                            count++;
                        }
                    }
                }
            }

        }
        System.out.println(count);

    }

    private static  int Byteland(int x, int y) {
        for (int a = Math.min(x, y); a >= 1; a--) {
            if ((x % a == 0) &&
                    (y % a == 0)) {
                return a;

            }
        }
        return 1;
    }





}

