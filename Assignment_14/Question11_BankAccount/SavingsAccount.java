package Assingments.Assignment_14.Question11_BankAccount;

public class SavingsAccount extends BankAccount{
	
	
	double interestRate;
	double totalAmount;
	
	public SavingsAccount (double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public double totalAmount (double capital ) {
		
		totalAmount = getCapital()*interestRate;
		
		return totalAmount;
	}
	
	
	
	

}
