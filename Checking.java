
public class Checking extends BankAccount{
	private final int overdraft = 25;
	private final int limit=1000;
	public Checking(){
		super();
	}
	
	public Checking(double amount){
		super(amount);
	}
	
	@Override
	public void withdraw(double amount){
		System.out.print("Amount Withdrew: ");
		System.out.printf("$%,.2f",amount);System.out.println("");
		double balance = super.getBalance();
		if(amount > balance){
			if(amount>=limit&&balance<=0){
				System.out.println("Overdraft fee charged: $"+overdraft+".00");
				System.out.println("Overdraft limit: "+"$"+limit+".00");
				super.setBalance(balance-overdraft);
				balance-=overdraft;
				super.setBalance(balance-limit);
			}
			else if(balance>0&&Math.abs(balance-amount)>=limit){
				System.out.println("Overdraft fee charged: $"+overdraft+".00");
				super.setBalance(balance-overdraft);
				balance-=overdraft;
				super.setBalance(balance-limit);
			}
			else{
				System.out.println("Overdraft fee charged: $"+overdraft+".00");
				super.setBalance(balance-overdraft);
				balance-=overdraft;
				super.setBalance(balance-amount);
			}
		}
		else{
			super.setBalance(balance-amount);
		}
		int fee = super.getTransanction();
		super.setTransanction(fee+1);
	}
	
	@Override
	public String toString(){
		return "Checkings Account \n"+super.toString()+"\n";
	}
	

}
