package chapter04.practice;

public class StudentPractice {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("Name: "+ stu1.getName() + "Age: "+ stu1.getAge());
        System.out.println("=================================================");

        Student stu2 = new Student("古力娜扎", 21);
        System.out.println("Name: "+ stu2.getName() + "Age: "+ stu2.getAge());

    }
}
