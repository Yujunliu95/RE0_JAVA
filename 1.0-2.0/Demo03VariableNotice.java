public class Demo03VariableNotice {
    public static void main(String[] args) {
        int num1 = 10;
        int num1 = 20;
        {
            int num6 = 60;
            System.out.println(num6); // 60
        }

        int a,b,c;
        a = 10;
        b = 20;
        c = 30;
        // not recommend
        int x = 100, y = 200, z = 300;
        System.out.println(x); // 100
    }
}