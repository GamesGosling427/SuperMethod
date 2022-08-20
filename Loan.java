package super_method;

public class Loan extends SavingAccount {
	int loannumber;
	double loanAmount;
	
	Loan()
	{
	
	}
	Loan(String bname, String ifsc, String accname, int accnumber, double balance, int loannumber, double loanamount)
	{
		super(bname,ifsc,accname,accnumber,balance);
		this.loannumber=loannumber;
		this.loanAmount=loanamount;
		
		
	}
	
}
