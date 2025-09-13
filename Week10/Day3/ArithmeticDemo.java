 package JAVA.Week10.Day3;

// public Q: State two rules for valid Java identifiers along with examples.

// Ans:

// Identifiers can only contain letters, digits, underscore (_), or dollar sign ($), but cannot start with a digit.

// ✅ Example: myVar, _name, $salary

// ❌ Invalid: 123abc

// Identifiers cannot be Java keywords.

// ✅ Example: className, totalMarks

// ❌ Invalid: class, int

// Easy 2 (2 marks)

// Q: Name any three Java keywords and specify their primary usage.

// Ans:

// class → used to declare a class.

// if → used for conditional statements.

// return → used to return a value from a method.

// Medium (4 marks)

// Q: Write Java code that demonstrates use of all arithmetic operators (+, -, *, /, %) on two variables and explain the output.

// Code:

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b)); // Addition → 13
        System.out.println("a - b = " + (a - b)); // Subtraction → 7
        System.out.println("a * b = " + (a * b)); // Multiplication → 30
        System.out.println("a / b = " + (a / b)); // Division → 3 (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus → 1 (remainder)
    }
}
