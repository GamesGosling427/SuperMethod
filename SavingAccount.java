package super_method;

public class SavingAccount extends Bank
{
	String accname;
	int accnumber;
	double balance;
	SavingAccount()
	{
		
	}
	SavingAccount(String bname, String ifsc, String accname, int accnumber, double balance)
	{
		super(bname,ifsc);
		this.accname=accname;
		this.accnumber=accnumber;
		this.balance=balance;
		
	}
}
