// package JAVA.Week10.Day5;

// public Q: Write a while loop that reads numbers from 1 to 10 and prints “High” if the number is greater than 5, otherwise prints “Low”.

// Code:

public class HighLow {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i > 5)
                System.out.println(i + " → High");
            else
                System.out.println(i + " → Low");
            i++;
        }
    }
}
