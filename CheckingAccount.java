public class CheckingAccount extends BankAccount {
	private final double FEE=0.15;
	
	CheckingAccount(String name, double amount){
		super(name, amount);
		setAccountNumber(this.getAccountNumber()+"-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);
	}
}