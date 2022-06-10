//using FileReader and BufferedReader and BufferedWriter for the fast performance of the input and output from the file
import java.io.*;
public class ReadLineByLine
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		int i=1;
		while((s=br.readLine())!=null)
		{
			System.out.println("Line "+i+" : "+s);
			i++;
		}
		br.close();	
		fr.close();
	}
}