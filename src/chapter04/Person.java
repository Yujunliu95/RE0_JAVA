package chapter04;

public class Person {

    String name;
    int age;

    public void show() {
        System.out.println("My name is: "+ name + " age: " + age);
    }

    //向age赋值数据，属于成员方法
    public void setAge(int num) {
        if (num < 100 && num >= 0) {
        age = num; }
        else {
            System.out.println("Invalid input");
        }
    }
    //专门获取age的数据
    public int getAge() {
        return age;
    }
}
