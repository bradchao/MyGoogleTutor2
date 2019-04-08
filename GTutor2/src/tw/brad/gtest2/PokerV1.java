package tw.brad.gtest2;

public class PokerV1 {
    public static void main(String[] args){
        int[] poker = new int[52];

        for (int i=0; i<poker.length; i++){
            int rand = (int)(Math.random()*52);

            boolean isRepeat = false;
            for (int j=0; j<i; j++){
                if (poker[j] == rand){
                    isRepeat = true;
                    break;
                }
            }

            if (isRepeat){
                i--;
                continue;
            }else{
                poker[i] = rand;
                System.out.println(poker[i]);
            }

        }


    }
}
