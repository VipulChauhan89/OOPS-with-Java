import java.util.*;
public class Employee
{
	int ID;
	String name,department;
	double salary;
	Employee()
	{
		ID=0;
		name="";
		department="";
		salary=0;
	}
	void setDetails(int ID,String name,String department,double salary)
	{
		this.ID=ID;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	void showDetails()
	{
		System.out.println("ID : "+ID);
		System.out.println("Name : "+name);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int ID;
		String name,department;
		double salary;
		System.out.print("Enter the name of the employee : ");
		name=in.nextLine();
		System.out.print("Enter the id of the employee : ");
		ID=in.nextInt();
		in.nextLine();
		System.out.print("Enter the department of the employee : ");
		department=in.nextLine();
		System.out.print("Enter the salary of the employee : ");
		salary=in.nextDouble();

		Employee a=new Employee();
		a.setDetails(ID,name,department,salary);
		a.showDetails();
	}
}
