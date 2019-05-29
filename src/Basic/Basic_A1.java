package Basic;

import java.util.Arrays;

public class Basic_A1 {


    public static void main(String[] args) {

        // Write a java Program to find the largest two numbers in a given array
        // (hint: try to use sorting in a smart way)

        int allNum[] = {20, 30 ,40 ,50 ,60, 120};
        int firstN = 0;
        int secondN = 0;

        for(int i = 0; i < allNum.length; i ++){
            if (firstN < allNum[i]){
                secondN = firstN;
                firstN = allNum[i];
            } else if (secondN > allNum[i]){
                secondN = allNum[i];
            }
        }
            System.out.println("First number is: " + firstN + " and second number is: " +secondN);
    }
}
