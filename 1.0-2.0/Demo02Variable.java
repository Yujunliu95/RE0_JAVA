public class Demo02Variable {
    public static void main(String[] args) {
        // create variable
        // type variable-name
        int num1;
        num1 = 10;
        System.out.println(num1);
        // change original int
        num1 = 20;
        System.out.println(num1);
        // or more easy way
        int num2 = 30;
        System.out.println(num1);
        System.out.println("========");
        byte num3 = 30;
        System.out.println(num3);
        //byte num4 = 400 return error

        float num7 = 2.5F;
        System.out.println(num7); // 2.5

        char zifu1 = 'A';
        System.out.println(zifu1); // A

        var1 = false;
        System.out.println(var1); // false

        boolean var2 = var1; // trans var1(false) to var2
        System.out.println(var2); //false



        }
}