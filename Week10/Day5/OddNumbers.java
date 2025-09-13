// : Print all odd numbers between 1 and 30 using a for loop and if statement.

// Code:

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) { // condition for odd numbers
                System.out.print(i + " ");
            }
        }
    }
}