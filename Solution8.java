
// Write a Java program to calculate sum of digits of a given numbers. Numbers are provided through command line. Print all the numbers and sum of its digits.
public class Solution8 {
    public static void main(String []args){
        int a;
        for(int i=0;i<args.length;i++){
            a=Integer.parseInt(args[i]);
            System.out.println(a+ " "+sumOfDigits(a));
        }
    }

}
