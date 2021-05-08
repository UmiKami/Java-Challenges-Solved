package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        int n1 = 100;

        byte myByteNum = (byte)(n1 / 2);

        System.out.println(myByteNum);


        // Challenge 1

        System.out.println("------------------------------------------------\n------------------------------------------\n--CHALLENGE");

        byte bN = 123;
        short sN = 15023;
        int iN = 129;

        long lN = 50000L + 10L*(bN + sN + iN);

        System.out.println("10 times the sum of the int, byte, and short: " + lN);


        // Challenge 2
        System.out.println("------------------------------------------------\n------------------------------------------\n--CHALLENGE 2");

        double pound = 200d;

        double kilogram = pound * 0.45359237d;

        System.out.println("200 pounds = " + kilogram + " Kg");


        if(pound == 200d) {
            System.out.println("You have 200 pounds");
        }
    }
}
