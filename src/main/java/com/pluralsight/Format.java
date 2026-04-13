package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        System.out.println(formatName("Kendall", "Dillon"));

    }

    public static String formatName(String firstName, String lastName){

        return lastName + ", " + firstName;

    }

}
