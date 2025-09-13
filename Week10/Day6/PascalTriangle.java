// package JAVA.Week10.Day6;

// public Pattern 6: Print Pascal Triangle
// A Java program to print Pascal’s triangle using nested loops and the binomial coefficient
// formula.
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

public class PascalTriangle
{
public static void main(String[] args)
{
int rows = 5;
for (int i = 0; i < rows; i++)
{
int number = 1;
// Print initial spaces
for (int j = 0; j < rows - i; j++)
{
System.out.print(" ");
}
for (int j = 0; j <= i; j++)
{
System.out.print(number + " ");
number = number * (i - j) / (j + 1);
}
System.out.println();
}
}
} 
    

