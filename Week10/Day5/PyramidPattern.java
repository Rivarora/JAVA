// package JAVA.Week10.Day5;

// public Q (Activity): Create a program using nested loops to print the following pyramid pattern for any N (user input), and use if-else conditions to format the spaces and stars:

// Example for N = 5

//     *    
//    ***   
//   *****  
//  ******* 
// *********


// Code:

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars with condition
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n) // edges + last row
                    System.out.print("*");
                else
                    System.out.print("*"); // (can replace with " " for hollow pyramid)
            }
            System.out.println();
        }
        sc.close();
    }
  
}
