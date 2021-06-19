package chapter6;

import java.util.Scanner;

public class PoundToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate;
        double dollar[];
        double pound[];
        System.out.print("Please enter the number of items: ");
        int num = sc.nextInt();
        dollar = new double[num];
        pound = new double[num];
        enterPrices(dollar);
        System.out.print("Enter rate of conversion to pound: ");
        rate = sc.nextDouble();
        pound = convert(dollar, rate, num);
        display(dollar, pound);
        sumAll(pound, dollar);
    }
    static double[] enterPrices(double[] dollarIn) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < dollarIn.length; i++) {
            System.out.print("Please enter item price " + (i+1) + ":");
            dollarIn[i] = sc.nextDouble();
        }
        return dollarIn;
    }
    static double[] convert(double[] dollarIn, double rate, int num) {
        double[] poundOut = new double[num];
        for (int i = 0; i < dollarIn.length; i++) {
            poundOut[i] = dollarIn[i] * rate;
        }
        return poundOut;
    }

    static void display(double[] dollarIn, double[] poundIn) {
        for (int i = 0; i < dollarIn.length; i++) {
            System.out.println("Item number " + (i+1) + " price:" + dollarIn[i]);
        }
        for (int i = 0; i < poundIn.length; i++) {
            System.out.println("Item number " + (i+1) + " price:" + poundIn[i]);
        }
    }
    static void sumAll(double[] poundIn, double[] dollarIn) {
        double result = 0;
        double result2 = 0;
        for (int i = 0; i < poundIn.length; i++) {
            result = result + poundIn[i];
        }
        System.out.println("The total price in pound is " + result);
        for (int i = 0; i < dollarIn.length; i++) {
            result2 = result2 + dollarIn[i];
        }
        System.out.println("The total price in dollar is " + result2);
    }
}
