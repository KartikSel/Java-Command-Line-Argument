
//Write a Java program to calculate factorial of a number. Number is provided through command line.
public class Solution7 {
    public static void main(String []args){
        int n=Integer.parseInt(args[0]);

        int f = 0;
        for(int i=1,f=1;i<=n;i++) {
            f = f * i;
        }
        System.out.println("Factorial is "+f);

    }

}
