package chapter04;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("Call " + who);
    }

    public void sendMassage() {
        System.out.println("Send massage");
    }
}
