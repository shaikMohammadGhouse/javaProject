package main.java_new.bank;

public class SavingAccount implements Account
{

	
	double mainAmount;
	@Override
	public void deposit(double amount)
	{
		this.mainAmount=this.mainAmount+amount;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl(double amount) {
	
		if(amount<this.mainAmount)
		{System.out.println("too less amount to withdraw...");}
		else	this.mainAmount=this.mainAmount-amount;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balanceEnq()
	{
	
		System.out.println("main balance..."+mainAmount);
		// TODO Auto-generated method stub
		
	}

}
