import java.util.*;
public class Shape
{
	int Area(int x) //square
	{
		return x*x;
	}
	double Area(int x,int y,int z) //triangle
	{
		int s=(x+y+z)/2;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
	double Area(double x,double y)//rectangle
	{
		return x*y;
	}
	double Area(double x)//circle
	{
		return x*x*3.14;
	}
	public static void main(String args[])
	{
		int n,x,y,z;
		double x1,y1;
		Scanner in=new Scanner(System.in);
		Shape a=new Shape();
		System.out.print("Enter \n1-To calculate the area of Square \n2-To calculate the area of triangle \n3-To calculate the area of rectangle \n4-To calculate the area of circle \nEnter your choice : ");
		n=in.nextInt();
		switch(n)
		{
			case 1:
				System.out.print("Enter the side of the Square : ");
				x=in.nextInt();
				System.out.println("Area of the Square is = "+a.Area(x));
				break;
			case 2:
				System.out.print("Enter the side of the sides of the triangle : ");
				x=in.nextInt();
				y=in.nextInt();
				z=in.nextInt();
				System.out.println("Area of the Triangle is = "+a.Area(x,y,z));
				break;
			case 3:
				System.out.print("Enter the side of the length and breadth of the rectangle : ");
				x1=in.nextDouble();
				y1=in.nextDouble();
				System.out.println("Area of the Rectangle is = "+a.Area(x1,y1));
				break;
			case 4:
				System.out.print("Enter the radius of the circle : ");
				x1=in.nextDouble();
				System.out.println("Area of the Circle is = "+a.Area(x1));
				break;
			default:
				System.out.println("You entered the wrong choice. ");
		}
	}
}
