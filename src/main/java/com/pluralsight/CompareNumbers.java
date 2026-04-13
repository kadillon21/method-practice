package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        System.out.println(isEven(6));
        System.out.println(isPositive(0));

    }

    public static boolean isEven(int number){

        boolean notOdd = false;

        if (number % 2 == 0){
            notOdd = true;
        }

        return notOdd;

    }

    public static boolean isPositive(double number){

       boolean notNegative = true;

       if (number < 0){
           notNegative = false;
       }

        return notNegative;
    }

}
