//package JAVA.Week10.Day3;
public class Operator {
    public static void main(String[] args) {
        int a = 8, b = 3;
        System.out.println("Add: " + (a + b)); // Arithmetic +
        System.out.println("Subtract: " + (a - b)); // Arithmetic -
        System.out.println("Multiply: " + (a * b)); // Arithmetic *
        System.out.println("Divide: " + (a / b)); // Arithmetic /
System.out.println("Remainder: " + (a % b)); // Arithmetic %
a += 2; System.out.println("a += 2: " + a); // Assignment +=
a++; System.out.println("a++: " + a); // Unary ++
System.out.println("a == b: " + (a == b)); // Relational ==
System.out.println("a != b: " + (a != b)); // Relational !=

System.out.println("a > b: " + (a > b)); // Relational >
boolean flag = (a > b) && (b > 0); // Logical &&
System.out.println("Logical AND: " + flag);
int bitwise = a & b; // Bitwise &
System.out.println("Bitwise AND: " + bitwise);
int x = (a > b) ? a : b; // Ternary
System.out.println("Ternary max: " + x); {
    
}}}
