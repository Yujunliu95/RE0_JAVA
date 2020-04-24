package chapter04;

public class Objectperson {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "John Smith";
        //person.age = 40; 错误写法
        person.setAge(20);
        person.show();

    }
}
