package API;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList05 {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //以下为错误写法
//        ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num = listC.get(1);

        System.out.println("第一号元素是: " + num);


    }
}
