// package JAVA.Week10.Day4;

// public Q: Explain the difference between while and do-while loops with code examples.

// Ans:

// while loop: checks condition before executing. May not run at all.

// do-while loop: executes code at least once, then checks condition.

// Code Example:

public class LoopDemo {
    public static void main(String[] args) {
        int x = 0;

        // while loop
        while (x > 0) {
            System.out.println("While Loop: " + x);
        }

        // do-while loop
        do {
            System.out.println("Do-While Loop: " + x);
        } while (x > 0);
    }
}
