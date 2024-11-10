
//Write a Java program to add two numbers. Numbers are provided through command line.

public class Solution1 {
    public static void main(String [] args)
    {
       int sum = Integer.parseInt(args[0])+ Integer.parseInt(args[1]);
        System.out.println("Sum is ="+sum);
    }
}
