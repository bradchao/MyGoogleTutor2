package tw.brad.gtest2;

public class Brad15 {

    public static void main(String[] args){
        int[][] a1;
        int[] a2[];
        int a3[][];

        a1 = new int[2][3]; // 2 x 3

        a2 = new int[3][];
        a2[0] = new int[2];
        a2[1] = new int[3];
        a2[2] = new int[4];

        System.out.println(a2.length);
        System.out.println(a2[0].length);
        System.out.println(a2[1].length);
        System.out.println(a2[2].length);


        for (int i=0; i<a2.length; i++){
            for (int j=0; j<a2[i].length; j++){
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----");
        a2[0][1] = 3;
        a2[1][2] = 4;
        a2[2][1] = 5;
        for (int[] v: a2){
            for (int vv : v){
                System.out.print(vv + " ");
            }
            System.out.println();
        }




    }

}
