package chapter04;

public class PracticeStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("luhan");
        stu.setAge(20);
        stu.setMale(true);


        System.out.println("name " + stu.getName());
        System.out.println("age " + stu.getAge());
        System.out.println("sex " + stu.isMale());

    }
}
