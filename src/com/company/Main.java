package com.company;
import java.sql.Array;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    char choice;
    Scanner sc = new Scanner(System.in);
    int[] someArray;
    System.out.print("How many elements? ");
    int size = sc.nextInt();
    someArray = new int[size];

    do {
        System.out.println();
        System.out.println("[1] Enter values");
        System.out.println("[2] Find Maximum");
        System.out.println("[3] Calculate Sum");
        System.out.println("[4] Check Membership");
        System.out.println("[5] Search Array");
        System.out.println("[6] Display Values");
        System.out.println("[7] Exit");
        System.out.print("Enter choice [1-7]: ");
        choice = sc.next().charAt(0);

        switch(choice) {
            case '1':
                fillArray(someArray);
                break;
            case '2':
                System.out.println("The highest number is " + max(someArray));
                break;
            case '3':
                System.out.println("The sum is " + sum(someArray));
                break;
            case '4':
                boolean found = isMember(someArray);
                if(found) {
                    System.out.println("That value is a member");
                } else {
                    System.out.println("That value is not a member");
                }

                break;
            case '5':
                System.out.print("Enter a number to search: ");
                int item = sc.nextInt();
                int index = search(item, someArray);
                if(index == -999) {
                    System.out.println("The value " + item + " is not found.");
                } else {
                    System.out.println("The value " + item + " is at index " + index + ".");
                }
                break;
            case '6':
                display(someArray);
                break;
        }
    } while (choice != '7');

    }

    static void fillArray(int[] arrayIn) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print("Enter value: ");
            arrayIn[i] = sc.nextInt();

        }
    }
    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++) {
            if(arrayIn[i] > result) {
                result = arrayIn[i];
            }
        }

        return result;
    }
    static int sum(int... arrayIn) {
        int total = 0;
        for (int current:arrayIn) {
            total += current;
        }
        return  total;

    }

    static boolean isMember(int... arrayIn) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num = sc.nextInt();

        for (int current:arrayIn) {
            if(num == current) {
                return true;
            }
        }
        return false;
    }

    static int search(int value, int... arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if(value == arrayIn[i]) {
                return i;
            }
        }
        return -999;
    }

    static void display(int... arrayIn) {
        for (int i = 0; i < arrayIn.length ; i++) {
            System.out.println("array[" + i + "]" + " = " + arrayIn[i]);
        }
    }

}


