package ArrayListPractice;

/*
第一题：数值添加到集合
        生成6个1~33之间的随机整数,添加到集合,并遍历

        1. 思路：需要存储6个数字，创建一个集合， <Integer>
        2. 产生随机数，需要用到Random
        3. 用循环6次，来产生6个随机数字：for循环
        4. 循环内调用r.nextInt(int n), 参数0-32，整体+1才是33
        5. 把数字添加到集合中：add
        6. 遍历集合：for、siz、get
*/


import java.util.ArrayList;
import java.util.Random;



public class Practice01 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;

            list.add(num);

            //System.out.println(num);
            
        }



        //遍历

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
            
        }
    }
}
