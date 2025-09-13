// package JAVA.Week10.Day5;

// public Q: Display a rectangular pattern of stars where the number of rows and columns is read from the user (using nested loops and conditionals).

// Code:

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
        sc.close();
    }
} 
