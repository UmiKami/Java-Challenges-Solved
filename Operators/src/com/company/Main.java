package com.company;

public class Main {

    public static void main(String[] args) {
	     double n1=20.00d;
	     double n2=80.00d;

	     double ans1 = (n1 + n2) * 100;

	     double finalAns = ans1 % 40;

	     boolean isZero = (finalAns == 0) ? true : false;

	     System.out.println(isZero);

	     if (!isZero)
	     	System.out.println("Got some remainder left");
    }
}
