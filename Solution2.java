
// Write a Java program to add N numbers. Numbers are provided through command
public class Solution2 {
    public static void main(String [] args)
    {
        int n = 0;
        for(int i = 0 ; i<= args.length ; i++)
        {
            n = n+Integer.parseInt(args[i]);
        }
        System.out.println("Sum is ="+n);

    }
}
