// package JAVA.Week10.Day5;

// public Problem 5: FizzBuzz Using for Loop and if-else
// Print numbers 1 to 20, but for multiples of 3 print “Fizz”, for multiples of 5 print “Buzz”,
// for multiples of both print “FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args) {
for (int k = 1; k <= 20; k++) {
if (k % 3 == 0 && k % 5 == 0) {
System.out.println("FizzBuzz");
} else if (k % 3 == 0) {
System.out.println("Fizz");
} else if (k % 5 == 0) {
System.out.println("Buzz");
} else {
System.out.println(k);
}
}
}}
