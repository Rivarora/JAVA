// package JAVA.Week10.Day5;

// public Problem 4: Print a Pattern Using Nested Loops and
// Conditionals
// Print the following pattern using nested loops and if conditions:
// * * *
// *   *
// * * *
public class Pattern {
    public static void main(String[] args) {
for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 1 || i == 3 || j == 1 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


