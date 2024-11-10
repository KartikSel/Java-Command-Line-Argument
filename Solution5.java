
// Write a Java program to check whether a given number is a Prime number or not. Number is given through command line.
public class Solution5 {
    public static boolean isPrime(int n) {
        int i;
        for (i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }
}
