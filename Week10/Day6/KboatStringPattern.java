// package JAVA.Week10.Day6;

// public Pattern 5: Staircase Pyramid of Word.
// Write a program to accept a word (say, INTELLIJ) and display the pattern:
// I N T E L L I J
// N T E L L I J
// T E L L I J
// E L L I J
// L L I J
// L I J
// I J
// J

import java.util.Scanner;
public class KboatStringPattern
{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = in.nextLine();
int len = word.length();
for (int i = 0; i < len; i++) {
for (int j = i; j < len; j++) {
char ch = word.charAt(j);
System.out.print(ch);
}
System.out.println();
}
}
}
