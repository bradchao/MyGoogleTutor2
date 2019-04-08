package tw.brad.gtest2;

public class Brad05 {
    public static void main(String[] args){
        int score = (int)(Math.random() * 101); // 0 - 100
        System.out.println(score);
        // 90+ => A
        // 80+ => B
        // 70+ => C
        // 60+ => D
        // 60- => E
        if (score >= 90) {
            System.out.println("A");
        }else if (score >= 80){
            System.out.println("B");
            score = 65;
        }else if (score >= 70){
            System.out.println("C");
        }else if (score >= 60){
            System.out.println("D");
        }else {
            System.out.println("E");
        }

        System.out.println(score);







    }

}
