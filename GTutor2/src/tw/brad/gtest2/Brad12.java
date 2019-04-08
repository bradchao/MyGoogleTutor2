package tw.brad.gtest2;

public class Brad12 {
    public static void main(String[] args){
        int[] a1;
        int a3[];
        boolean[] b1 = new boolean[2];
        double a2[] = new double[4];

        a1 = new int[3];        // zero-base

        System.out.println(a1);
        System.out.println(a1.length);
        a1[0] = 123;
        a1[1] = 321;
        a1[2] = 111;
        int c = 1;
        a1[c] = 222;

        for (int i=0; i < a1.length; i++){
            System.out.println(a1[i]);
        }
        System.out.println("-----");
        for (int v : a1 ){      // for-each
            if (v == 222) continue;
            System.out.println(v);
        }



    }
}
