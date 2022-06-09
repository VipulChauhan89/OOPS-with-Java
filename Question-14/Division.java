import java.util.*;
public class Division
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float a=in.nextFloat();
        System.out.print("Enter the Second number : ");
        float b=in.nextFloat();
        try
        {
            float c=a/b;
            System.out.println("Division is = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not divide the number by zero");
        }
        
    }
}
