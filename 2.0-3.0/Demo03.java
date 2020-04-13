public class Demo03 {
    public static void main(String[] args) {
        int num = 13;

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        int score = 98;
        if (score >= 90 && score <= 100){
            System.out.println("优秀");

        } else if (score >= 80 && score < 90) {
            System.out.println("好");

        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("数据错误");
        }





    }
}
