package chapter04;

public class Object05 {

    String name;            //成员变量
    public void methodA() {
        int num = 20;            //局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) {// 方法的参数就是局部变量
        // 参数被调用时，必然会被赋值
        System.out.println(param);
        int age;
        // System.out.println(age); //error 没赋值，不能用
        System.out.println(name);
    }

}
