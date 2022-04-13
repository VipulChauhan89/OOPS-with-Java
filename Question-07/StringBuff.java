import java.util.*;
public class StringBuff
{
	public static void main(String args[])
	{
        StringBuffer s=new StringBuffer("HELLO ");
        StringBuffer s1=new StringBuffer("HELLO");
        
        //(i) Append "Java"
		s.append("Java");           //HELLO Java
        System.out.println(s);
        
        //(ii) Insert "Java" at index 1
		s.insert(1,"Java");	        //HJavaELLO Java
		System.out.println(s);
        
        //(iii) Replace with "Java" with characters between index 1 to 2
        s.replace(1,2,"Java");      //HJavaavaELLO Java
        System.out.println(s);
        
        //(iv) Delete characters between index 1 and 2 
        s.delete(1,2);              //HavaavaELLO Java
        System.out.println(s);
        
        //(v) Reverse the string "HELLO"
        s1.reverse();               //OLLEH
		System.out.println(s1);	
	}
}
