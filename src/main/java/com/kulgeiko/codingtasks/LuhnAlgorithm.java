package com.kulgeiko.codingtasks;

import java.util.Arrays;

/**
 * Created by akulgeiko on 7/18/2018.
 */
public class LuhnAlgorithm {


    public static void main(String... args){
        int[] cardNumberInValid = {4,2,0,5,4,5,6,8,9,6,5,4,4,1,2,3};
        int[] cardNumberValid = {4,5,6,1,2,6,1,2,1,2,3,4,5,4,6,7};
        int[] myCardNumberValid = {4,0,4,8,1,9,7,5,2,0,2,0,0,5,2,8};

        System.out.println("Card number length - " + myCardNumberValid.length);
        System.out.println("Card number - " + Arrays.toString(myCardNumberValid));
        System.out.println("Validation results - " + validateCardNumber(myCardNumberValid));
    }


    public static boolean validateCardNumber(int[] cardNum){

        int[] newNum = new int[cardNum.length];
        int result=0;

        for (int i=cardNum.length-1; i>=0; i--){
            if(i%2==0){
                if(cardNum[i]*2 > 9) {
                    newNum[i]= cardNum[i]*2-9;
                } else {
                    newNum[i] = cardNum[i]*2;
                }
            } else {
                newNum[i] = cardNum[i];
            }
        }

        System.out.println("New number - " + Arrays.toString(newNum));
        for(int i=0; i<newNum.length; i++){
            result = result + newNum[i];
        }

        System.out.println("Result - " + result);
        if(result % 10 == 0) return true;
        else return false;
    }



}


