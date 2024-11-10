
//Write a Java program to calculate HCF of two numbers. Numbers are provided through command line.
public class Solution10 {
    public static void main(String []args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int H=a<b?a:b;
        for(;H>=1;H--)
            if(a%H==0 && b%H==0)
                break;
        System.out.println("HCF is "+H);
    }

}
