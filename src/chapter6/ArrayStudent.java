package chapter6;

import java.util.Scanner;

public class ArrayStudent {
    public static void main(String[] args) {
        int [] javaStudents = new int[3];
        enterExamMarks(javaStudents);
        increaseMarks(javaStudents);
        for (int current:javaStudents) {
            System.out.println(current);
        }
        System.out.println("Did all passed? " + allHavePassed(javaStudents));

    }

    static int[] enterExamMarks(int[] arrayIn) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print("Enter Exam Mark: ");
            arrayIn[i] = sc.nextInt();
        }
        return  arrayIn;

    }
    static int[] increaseMarks(int[] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            arrayIn[i] = arrayIn[i]+5;
        }
        return arrayIn;
    }
    static boolean allHavePassed(int[] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] < 40) {
                return false;
            }
        }
        return true;
    }

}
