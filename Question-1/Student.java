import java.util.*;
public class Student
{
	String Name,Branch,University;
	int Id;
	void setDetails(String Name,int Id,String University,String Branch)
	{
		this.Name=Name;
		this.Id=Id;
		this.University=University;
		this.Branch=Branch;
	}
	void showDetails()
	{
		System.out.println();
		System.out.println();
		System.out.println("Name : "+Name);
		System.out.println("Student Id :"+Id);
		System.out.println("Branch : "+Branch);
		System.out.println("University : "+University);
	} 
	public static void main(String args[])
	{
		String Name,Branch,University;
		int Id;
		Scanner in=new Scanner(System.in);

		System.out.print("Enter the Student Id : ");
		Id=in.nextInt();
		in.nextLine();

		System.out.print("Enter the University name : ");
		University=in.nextLine();

		System.out.print("Enter the name of the student: ");
		Name=in.nextLine();

		System.out.print("Enter the Branch : ");
		Branch=in.nextLine();
		
		
		Student a=new Student();
		a.setDetails(Name,Id,University,Branch);
		a.showDetails();
	}
}
