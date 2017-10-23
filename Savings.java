
public class Savings extends BankAccount{
	public Savings(){
		super();
	}
	
	public Savings(double amount){
		super(amount);
	}
	
	@Override
	public void withdraw(double amount){
		double balance = super.getBalance();
		if(amount > balance){
			System.out.println("Withdraw amount was greater than your Balance");
			System.out.println("OverDraft, no fee charge");
		}
		else{
			System.out.print("Amount Withdrew: ");
			System.out.printf("$%,.2f",amount);System.out.println("");
			super.setBalance(balance-amount);
		}
		int fee = super.getTransanction();
		super.setTransanction(fee+1);
	}
	
	@Override
	public String toString(){
		return "Savings Account \n"+super.toString()+"\n";
	}

}
