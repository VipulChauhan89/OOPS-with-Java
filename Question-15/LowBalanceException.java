import java.util.*;
public class LowBalanceException extends Exception
{
	int account_no;
	String name;
	float amount;
	public LowBalanceException(String s)
	{
		super(s);
	}
	public LowBalanceException()
	{
		account_no=0;
		name="";
		amount=0;
	}
	void insert(int account_no,String name,float amount)
	{
		this.account_no=account_no;
		this.name=name;
		this.amount=amount;
	}	
	void withdraw(float amount)
	{
        try{

            if(this.amount<amount)
            {
                throw new LowBalanceException("Insufficient balance.");
            }
            else
            {
                this.amount-=amount;
                System.out.println("New balance = "+this.amount);	
            }
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
	}
	void deposit(float amount)
	{
		this.amount+=amount;
	}
	void display()
	{
		System.out.println("Account Number = "+account_no);
		System.out.println("Name = "+name);
		System.out.println("Amount = "+amount);
	}
	void checkBalance()
	{
		System.out.println("Balance = "+this.amount);	

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int account_no;
		String name;
		float amount,amount2;
		System.out.print("Enter the account number : ");
		account_no=in.nextInt();
		in.nextLine();

		System.out.print("Enter the name of the person : ");
		name=in.nextLine();
		
		System.out.print("Enter the amount in the bank : ");
		amount=in.nextFloat();

		LowBalanceException a=new LowBalanceException();
		a.insert(account_no,name,amount);
		
		System.out.print("Enter the amount you want to withdraw : ");
		amount2=in.nextFloat();
		
		a.withdraw(amount2);
		
		System.out.print("Enter the amount you want to deposit in the bank : ");
		amount2=in.nextFloat();
		a.deposit(amount2);
		
		a.checkBalance();
		a.display();
	}
}
