package LAB9;
public class SavingsAccount extends BankAccount {
	double rate=2.5; //variables 
	int savingsNumber=0;
	String accNumber;
	public SavingsAccount(String name, double amt){ 
	super(name,amt);
	this.accNumber = super.getAccountNumber()+ "-"+savingsNumber;
	}
	public void postInterest(){ 
	  
	}
	public String getAccountNumber(){
	return null;
	}
	public SavingsAccount(SavingsAccount acc,double balance){
	super(acc,balance);
	this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
	}
}