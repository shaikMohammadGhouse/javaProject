package main.java_new.bank;

public class StartBankApp 
{

	public static void main(String[] args) {

		Account lc=new LoanAccount();
		Account sc=new SavingAccount();

		lc.deposit(10000);
		sc.deposit(30000);
		lc.withdrawl(30000);
		sc.balanceEnq();
		lc.balanceEnq();
		
	}
	
	

}
