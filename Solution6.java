
//Write a Java program to filter and print numbers which are prime. Numbers are provided through command line.
public class Solution6 {

    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < args.length; i++)
            if (isPrime(Integer.parseInt(args[i])))
                System.out.println(Integer.parseInt(args[i]));
    }
}
