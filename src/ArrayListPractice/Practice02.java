package ArrayListPractice;

import java.util.ArrayList;

/*
问题：自定义4个学生对象,添加到集合,并遍历
思路：
1. 自定义Student学生类，4个部分
2. 创建一个集合，用来储存对象、泛型 <student>
3. 根据类，创建4个学生对象
4. 将4个对象添加到集合中： add
5. 遍历集合： for size get
*/
public class Practice02 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公", 20);
        Student two = new Student("欧阳锋", 21);
        Student three = new Student("黄药师", 22);
        Student four = new Student("段智兴", 23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("Name" + stu.getName() + "Age" + stu.getAge());
        }


    }





}
