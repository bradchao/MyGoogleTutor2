package tw.brad.gtest2;

public class Brad99 {
    public static void main(String[] args){


        brad: for (int k=0; k<2; k++) {
            for (int j = 1; j <= 9; j++) {
                for (int i = 2; i <= 5; i++) {
                    int newi = i + k * 4;
                    int r = newi * j;
                    System.out.print(newi + " x " + j + " = " + r + "\t");
                    if (i + j == 7){
                        break brad;
                    }
                }
                System.out.println();
            }
            System.out.println("----------");
        }


    }
}
