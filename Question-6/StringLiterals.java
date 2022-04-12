import java.util.*;
public class StringLiterals
{
	public static void main(String args[])
	{
		String s1="Java"; 
        String s2="JAVA";
		//(i) Try to concat "Welcome" and write down your observation.
        System.out.println(s1.concat(" Welcome"));                  //Java Welcome
		System.out.println(s1);		                                //Java
        /* The string s1 does not get changed, even though it is invoking the method concat(),as it is immutable. 
        It only creates another copy of s1 and concat on it and once it it done the copy it deleted by the java garbage collector*/	
		
		//(ii) Find character at index 1
		System.out.println(s1.charAt(1));			                //character at index 1 is 'a'
		
		//(iii) Find index of first 'a'.
		System.out.println(s1.indexOf('a'));		                //index of first 'a' = 1
		
		//(iv) Find index of second 'a'
		System.out.println(s1.indexOf('a',s1.indexOf('a')+1));		//index of second 'a' = 3
        
		//(v) Compare "Java" to "JAVA"
		System.out.println(s1.equals(s2));			                //false
		
		//(vi) Compare "Java" to "JAVA" ignoring the case
		System.out.println(s1.equalsIgnoreCase(s2));		        //true
		
		//(vii) Find the index of first 'a' from last
		System.out.println(s1.lastIndexOf('a'));	                //index of first 'a' from last = 3
	}
}