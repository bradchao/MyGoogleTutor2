package tw.brad.gtest2;

public class Brad04 {

    public static void main(String[] args){
        // float double
        float var1;
        float var2 = 12.3f;
        double var3 = 12.3;

        // byte, short,char int => int + long => long + float => float + double
        // ==> double
        int a = 0, b = 0;
        double c = var2 + a;
        //System.out.println(a / b);

        double var4 = 12.3f;
        System.out.println(var4);


        char var5 = 'a', var6 = 65; // 2^16 => 0 - 65535
        char var7 = '谷';
        System.out.println(var7);

        int d = var5 + 10;
        System.out.println(d);

        boolean var8 = true;    // false


    }
}
