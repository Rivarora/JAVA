// Q: Write a sample command to run a Java program with two command line arguments.
// Ans:

// javac MyProgram.java
// java MyProgram arg1 arg2


// Here arg1 and arg2 are the command-line arguments passed to the program.

// Hard (6 marks)

// Q: Explain—using your own analogy—how command line arguments work in Java and why checking their length is important.
// Ans:
// Think of command line arguments like giving ingredients to a cook before cooking:

// If you say “make pasta with tomato and cheese”, the cook knows exactly what to use (like args[0] = tomato, args[1] = cheese).

// But if you only say “make pasta”, the cook won’t know the missing ingredients and the recipe fails.

// Similarly in Java, args[] stores what you type after the program name. If you don’t provide enough arguments, accessing them will throw an ArrayIndexOutOfBoundsException. That’s why we must check args.length.

// Hard Activity (8 marks)

// Q: Suppose you need a Java program that takes three numbers from the command line and prints their sum.
// Show the code and explain what happens if fewer than three arguments are provided.

// Code:

public class SumThree {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide 3 numbers.");
            return;
        }
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        int sum = a + b + c;
        System.out.println("Sum = " + sum);
    }
}