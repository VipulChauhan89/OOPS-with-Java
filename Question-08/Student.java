import java.util.*;
public class Student
{
    int ID;
    String Name,Branch,city,university;
    Student(int ID)
    {
        this.ID=ID;
    }
    Student(int ID,String Name)
    {
        this(ID);
        this.Name=Name;
    }
    Student(int ID,String Name,String Branch)
    {
        this(ID,Name);
        this.Branch=Branch;
    }
    Student(int ID,String Name,String Branch,String city)
    {
        this(ID,Name,Branch);
        this.city=city;
    }
    Student(int ID,String Name,String Branch,String city,String university)
    {
        this(ID,Name,Branch,city);
        this.university=university;
    }
    void show()
    {
        System.out.println("ID : "+ID);
        System.out.println("Name : "+Name);
        System.out.println("Branch : "+Branch);
        System.out.println("City : "+city);
        System.out.println("University : "+university);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ID;
        String Name,Branch,city,university;
        System.out.print("Enter the ID of the Student : ");
        ID=in.nextInt();
        in.nextLine();
        System.out.print("Enter the Name of the Student : ");
        Name=in.nextLine();
        System.out.print("Enter the Branch of the Student : ");
        Branch=in.nextLine();
        System.out.print("Enter the City of the Student : ");
        city=in.nextLine();
        System.out.print("Enter the University of the Student : ");
        university=in.nextLine();
        Student a=new Student(ID, Name, Branch, city, university);
        a.show();
    }
}
