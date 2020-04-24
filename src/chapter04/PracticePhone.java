package chapter04;

public class PracticePhone {
    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand = "Apple";
        one.price = 3999;
        one.color = "White";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("================");


        one.call("Jobs");
        one.sendMassage();
        System.out.println("========================================");





        Phone two = new Phone();

        one.brand = "Huawei";
        one.price = 4999;
        one.color = "Blue";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("================");


        one.call("oba");
        one.sendMassage();
    }
}
