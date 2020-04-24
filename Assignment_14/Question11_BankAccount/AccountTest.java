package Assingments.Assignment_14.Question11_BankAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount (10);
		account.setCapital(1500.5);
		System.out.println(account.totalAmount(account.getCapital()));
	}

}
