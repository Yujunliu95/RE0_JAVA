package API;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        // 创建ArrayList集合，list是名称，里面的数据都是String
        // 右侧<>内可以省略，与左边相同
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        System.out.println(list);
    }
}
