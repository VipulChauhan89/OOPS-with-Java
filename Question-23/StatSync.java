class Display
{
	public static synchronized void wish(String s)
	{
		for(int i=0;i<10;i++)
		{	
			System.out.print("Hello :");
			try
			{
				Thread.sleep(500);
			}		
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(s);
		}
	}
}
class Mythread extends Thread
{
	Display a;
	String name;
	Mythread(Display a,String name)
	{
		this.a=a;
		this.name=name;
	}
	public void run()
	{
		a.wish(name);
	}
}
public class StatSync
{
	public static void main(String args[])
	{
		Display d=new Display();
		Display d1=new Display();
		Mythread t=new Mythread(d,"Vipul");
		t.start();
		Mythread t1=new Mythread(d1,"Rahul");
		t1.start();
	}
}
