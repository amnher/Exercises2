package chapter6;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        char[][] square = { {'P','R','E','Y'},
                            {'L','A','V','A'},
                            {'O','V','E','R'},
                            {'T','E','N','D'}
                            };
        displayRow(square);
        displayColumn(square);
    }

    static void displayRow(char[][] arrayIn) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Please enter the row number [1-4]: ");
        choice = sc.nextInt();
        while(choice < 1 || choice >4) {
            System.out.print("Incorrect! Please enter a row [1-4]");
            choice = sc.nextInt();
        }
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                if (choice == (i+1)) {
                    System.out.print(arrayIn[i][j]);
                }

            }

        }
        System.out.println();
    }
    static void displayColumn(char[][] arrayIn) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Please enter the column number [1-4]: ");
        choice = sc.nextInt();
        while(choice < 1 || choice >4) {
            System.out.print("Incorrect! Please enter a column [1-4]");
            choice = sc.nextInt();
        }
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                if (choice == (j+1)) {
                    System.out.print(arrayIn[i][j]);
                }

            }

        }
        System.out.println();
    }
}
