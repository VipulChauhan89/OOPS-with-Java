/*using FileIReader and FileWriter 
and BufferedReader and BufferedWriter for the fast performance of the input and output from the file*/
import java.io.*;
public class FileReaderWriter
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(fr);
		int x=br.read();
		FileWriter fw=new FileWriter("file2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write((char)x);
		br.close();
		bw.close();	
		fr.close();
		fw.close();
	}
}