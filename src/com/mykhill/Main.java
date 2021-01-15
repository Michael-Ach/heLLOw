package com.mykhill;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT = 100;



        System.out.print("Principle: ");
        Scanner scanner = new Scanner(System.in);
        int principle = scanner.nextInt();

       // NumberFormat number = NumberFormat.getCurrencyInstance();
        //System.out.print(number.format(principle));

        System.out.print("Annual Rate: ");
       float annualRate= scanner.nextFloat();

       System.out.print("Period: ");
       byte period =scanner.nextByte();

        float annualRatePercent = annualRate/PERCENT;
        float monthlyInterestRate = annualRatePercent/MONTHS_IN_YEAR;         //r
        int   periodInMonths= period*MONTHS_IN_YEAR;                          //n

     double mortgage = principle*monthlyInterestRate*((Math.pow(1+annualRatePercent,periodInMonths))/(Math.pow(1+annualRatePercent,periodInMonths)-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();


        String result = currency.format(mortgage);
       // System.out.println("Mortgage"+currency.format(mortgage));
        System.out.println("The mortgage is "+result);

    }
}
