// package JAVA.Week10.Day6;

// public Question: Print the given pattern

public class TrianglePattern {
    public static void main(String[] args) {
        // First half (descending)
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Second half (ascending)
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
} 
