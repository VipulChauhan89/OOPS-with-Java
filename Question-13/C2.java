package P2;
import java.util.*;
import P1.*;
public class C2 implements I1
{
	public int mult(int a,int b)
	{
		return a*b;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		C2 c=new C2();
		C1 d=new C1();
		System.out.print("Enter first numbers : ");
		int a=in.nextInt();
		System.out.print("Enter second numbers : ");
		int b=in.nextInt();
		System.out.println("Sum = "+d.sum(a,b));
		System.out.println("Division = "+d.div((float)a,(float)b));
		System.out.println("Multiplication = "+c.mult(a,b));
	}
}
