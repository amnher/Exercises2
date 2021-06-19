package chapter6;

import java.util.Scanner;

public class Ragged1 {
    public static void main(String[] args) {
        int[][] triangle = new int[4][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        /*{{11},
                {2,3},
                {4,5,6},
                {7,8,9,10}
                };*/
        enterNum(triangle);
        max(triangle);
        printNum(triangle);
    }
    static int[][] enterNum(int[][] numIn) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numIn.length; i++) {
            for (int j = 0; j < numIn[i].length; j++) {
                System.out.print("Please enter number: ");
                numIn[i][j] = sc.nextInt();
            }
        }
        return numIn;
    }
    static void max(int[][] arrayIn) {
        int result = arrayIn[0][0];
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                if (result < arrayIn[i][j]) {
                    result = arrayIn[i][j];
                }
            }
        }
        System.out.println(result);
    }
    static void printNum(int[][] numIn) {
        for (int i = 0; i < numIn.length; i++) {
            for (int j = 0; j < numIn[i].length; j++) {
                System.out.print(numIn[i][j] + " ");

            }
            System.out.println();
        }
    }
}
