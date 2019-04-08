package tw.brad.gtest2;

public class Brad07 {
    public static void main(String[] args){
        int a = 10, b = 3;

        if (a++ >= 10 || b++ <= 3){
            System.out.printf("OK a = %d b = %d\n", a, b);
        }else{
            System.out.printf("XX a = %d b = %d\n", a, b);
        }

        int c = 3, d =2;
        System.out.println(c & d);
        System.out.println(c | d);
        System.out.println(c ^ d);




    }
}
