package tw.brad.gtest2;

import javax.swing.*;

public class Brad06 {
    public static void main(String[] args){
        String strYear = JOptionPane.showInputDialog("Input ur name");

        try {
            int year = Integer.parseInt(strYear);
            System.out.println(year);
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        // 2000
                        // ok
                    } else {
                        // 2100
                        // xx
                    }
                } else {
                    // 2016
                    // ok
                }
            } else {
                // 2019
                // xx
            }
        }catch (Exception e){
            System.out.println("別鬧了");
        }
    }
}
