// package JAVA.Week10.Day6;

// public Question: Print numbers from 1 to 5 in each row for 4 rows.

public class NumberPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {  // 4 rows
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
} 
    

