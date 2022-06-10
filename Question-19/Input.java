import java.util.*;
import java.io.*;
public class Input
{
    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        FileWriter fw=new FileWriter("file1.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        System.out.print("Enter your name : ");
        String s=in.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            bw.write(s.charAt(i));
        }
        bw.close();
        fw.close();
    }
}