package ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

public class Practice04 {

    public static void main(String[] args) {
// 创建Random 对象
        Random random = new Random();
// 创建ArrayList 对象
        ArrayList<Integer> biglist = new ArrayList<>();
// 添加随机数到集合
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(100) + 1;
            biglist.add(r);
        }
// 调用偶数集合的方法

        ArrayList<Integer> arrayList = getArrayList(biglist);
        System.out.println("偶数个数" + arrayList.size());
        System.out.println(arrayList);
    }

    //接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
// 创建小集合,来保存偶数
        ArrayList<Integer> smallList = new ArrayList<>();
// 遍历list
        for (int i = 0; i < list.size(); i++) {
// 获取元素

            Integer num = list.get(i);
// 判断为偶数,添加到小集合中
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
// 返回小集合
        return smallList;
    }
}
