package tw.brad.gtest2;

public class Brad14 {
    public static void main(String[] args){
        int[] p = new int[7];

        for (int i=0; i<100000; i++){
            int point = (int)(Math.random()*9 + 1); // 1 ~ 6
            p[point>=7?point-3:point]++;
        }
        if (p[0] == 0) {
            for (int i=1; i<p.length; i++) {
                System.out.println(i + "點出現" + p[i] + "次");
            }
        }else{
            System.out.println("debug");
        }
    }

}
