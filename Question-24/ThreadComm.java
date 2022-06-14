class Customer
{
	int balance=0;
	public synchronized void withdrawl(int amount)
	{
		System.out.println("Going to withdraw : ");
		if(balance<amount)
		{
			System.out.println("Low balance...... kindly Wait.....");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		balance-=amount;
		System.out.println("New balance : "+balance);
	}
	public synchronized void deposit(int balance)
	{
		System.out.println("Going to Deposit...");
		this.balance+=balance;
		System.out.println("Balance : "+this.balance);
		notify();
	}
}
class Mythread extends Thread
{
	Customer a;
	Mythread(Customer a)
	{
		this.a=a;
	}
	public void run()
	{
		a.withdrawl(1000);
	}
}
class Mythread1 extends Thread
{
	Customer a;
	Mythread1(Customer a)
	{
		this.a=a;
	}
	public void run()
	{
		a.deposit(2000);
	}
}
public class ThreadComm
{
	public static void main(String args[])
	{
		Customer d=new Customer();
		Mythread t=new Mythread(d);
		t.start();
		Mythread1 t1=new Mythread1(d);
		t1.start();
	}
}
