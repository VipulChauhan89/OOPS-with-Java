/*using FileInputStream and FileOutputStream 
and BufferedInputStream and BufferedOutputStream for the fast performance of the input and output from the file*/
import java.io.*;
public class FileReadWrite
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int x=bis.read();
		FileOutputStream fos=new FileOutputStream("file2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write(x);
		bos.close();
		bis.close();	
		fos.close();
		fis.close();
	}
}