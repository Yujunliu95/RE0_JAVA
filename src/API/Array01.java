package API;

public class Array01 {
    public static void main(String[] args) {

        // 创建一个长度为3的数组，里面用来存放person类型的对象

        Person[] array = new Person[3];
        // System.out.println(array[0]); NULL

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person ("古力娜扎", 20);
        Person three = new Person ("马尔扎哈", 38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); //地址值
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());
    }


}
