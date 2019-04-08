package tw.brad.gtest2;

public class Brad11 {
    public static void main(String[] args){

        long start = System.currentTimeMillis();
        int i = 91;
        boolean isOK = false;
        for (int j=2; j<=i/2; j++){
            if (i % j == 0){
                isOK = true;
                break;
                //System.out.println();
            }
        }
        System.out.println( isOK? "OK" : "XX");
        System.out.println(System.currentTimeMillis() - start);

    }
}
