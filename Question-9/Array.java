import java.util.*;
public class Array
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);	
		int n,m,find,count=0;
		System.out.print("Enter the number of rows in an array : ");
		n=in.nextInt();
		System.out.print("Enter the number of columns in an array : ");
		m=in.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter "+(n*m)+" elements of an array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		System.out.print("Enter the element you want to find in an array : ");
		find=in.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==find)
				{
					count=1;
				}
			}
		}
		if(count==0)
		{
			System.out.println("Element not found.");
		}
		else
		{
			System.out.println("Element found.");
		}
		System.out.println("The array is : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}