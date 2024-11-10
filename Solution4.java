
//Write a Java program to calculate LCM of two numbers. Numbers are provided through command line.
public class Solution4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int L = a > b ? a : b;
        for (; L <= a * b; L++)
            if (L % a == 0 && L % b == 0)
                break;
        System.out.println("LCM is " + L);
    }
}
