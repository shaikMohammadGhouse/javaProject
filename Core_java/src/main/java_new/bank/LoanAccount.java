package main.java_new.bank;

public class LoanAccount implements Account
{

	double mainAmount;
	@Override
	public void deposit(double amount)
	{
		this.mainAmount=amount-this.mainAmount;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl(double amount) 
	{
		this.mainAmount=amount+this.mainAmount;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balanceEnq() 
	{
	
		System.out.println("Loan Account you took :"+this.mainAmount+"from bank");
		// TODO Auto-generated method stub
		
	}

}
