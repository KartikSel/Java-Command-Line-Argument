
// Write a Java program to to find the greatest number among all the numbers provided through command line.
public class Solution9 {

    public static void main(String []args){
        int max,a;
        max=Integer.parseInt(args[0]);
        for(int i=1;i<args.length;i++){
            a=Integer.parseInt(args[i]);
            if(max<a)
                max=a;
        }
        System.out.println("Greatest number is "+max);
    }
}
